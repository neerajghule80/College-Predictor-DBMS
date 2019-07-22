package Server;

import MainDriver.*;

import java.util.*;
import java.util.concurrent.*;
import java.io.*;

public class Server {
	
	ExecutorService pool = null;
	int port;
	
	public Server(int port) {
		this.port=port;
		pool=Executors.newFixedThreadPool(5);
	}
	
	public static void main(String [] args) {
	}
}
