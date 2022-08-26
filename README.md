# MultiThreading
Multi Threading in Java

Multi Threading in Java is a process of executing multiple thread simultaneously.

Thread is a light wieght sub process, the smallest unit of processing
Running -> Media player , ms word simultaneously
Or downloading multiple files together

Creating ->
Using Runnable (Interface) (implements)
using Thread (class) which implements Runnable interface (extends)

Runnable interface contains method run() which is overridden in Thread class
run() is used to provide tasks to the thread

Starting Thread
where MyThread implements Runnable
MyThread t = new MyThread(); (its just a blueprint)

Thread thread =  new Thread(t); (CReating as a thread)

thread.start()

where Mythread extends Thread
MyThread t = new MyThread();
t.start() [start() is a method which is present inside Thread Class]


run() is used to specify the task to be executed in threads
start() is used to run/start execution of thread

Best way is to implement Runnable because we can extend another class but if we extend Thread class instead of Runnable, we wont be able to extend any other class because Java doesnt support Multiple inheritance.

THread Life Cycle

New
Start()
Runnable
run()                           ->sleep() ->            Non Runnable (Blocked)

Running

Terminated


Thread Operations :
Thread class is used to perform operations on Thread because it provides all the functionality.
THread class is present inside java.lang package
Operations
-> getName()
-> setName(String name)
-> run()
-> start()
-> getId()
-> setPriority(p)
-> getPriority()
-> sleep() , join() , interrupt() , resume() , stop() etc
-> currentThread()

Deamon Thread
Daemon Thread in java is a service provider thread that provide services to the user thread
setDaemon(Boolean) to set whether the thread is daemon or not
isDaemon() to check whether the thread is daemon
Garbage collector is best example of daemon thread
