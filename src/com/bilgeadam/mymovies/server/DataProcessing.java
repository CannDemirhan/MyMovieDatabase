package com.bilgeadam.mymovies.server;

import com.bilgeadam.mymovies.server.common.CommonData;

public class DataProcessing implements Runnable {

	public void run() {
		CommonData.getInstance().initializingStarted();
		CommonData.getInstance().importData();
		CommonData.getInstance().initializingStopped();
	}
}
