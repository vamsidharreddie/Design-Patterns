class MovieTicketFacade{
  private LoyaltyServices loyaltyServices;
  private NotificationService notification;
  private PaymentService paymentService;
  private SeatReservation seatReservation;
  private TicketService ticketService;
  public MovieTicketFacade(){
    loyaltyServices=new LoyaltyServices();
    notification=new NotificationService();
    paymentService=new PaymentService();
    seatReservation=new SeatReservation();
    ticketService=new TicketService();
  }
  void bookTicket(String username,String account,double amount,String seatno,String usermail){
    paymentService.pay(amount, account);
    seatReservation.reserveSeat(seatno, username);
    notification.SendNotification(usermail);
    loyaltyServices.addpoints(username);
    ticketService.generateTicket(username, seatno);
  }

}