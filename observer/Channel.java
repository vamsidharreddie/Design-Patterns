interface Channel{
void subscribe(Subscriber s);
void unsubscribe(Subscriber x);
void notifyAll(String str);
}