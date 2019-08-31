package concurrency.critical_section;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitCriticalSection {

	public static void main(String[] args) {
		PairManager pman1 = new ExplicitPairManager1();
		PairManager pman2 = new ExplicitParManager2();
		
		CriticalSection.testSynchronizeApproaches(pman1, pman2);
	}
}

class ExplicitPairManager1 extends PairManager {

	private Lock lock = new ReentrantLock();
	
	@Override
	public synchronized void increment() {
		lock.lock();
		try {
			pair.incrementX();
			pair.incrementY();
			store(getPair());
		} finally {
			lock.unlock();
		}
	}
}

class ExplicitParManager2 extends PairManager {

	private Lock lock = new ReentrantLock();
	
	@Override
	public void increment() {
		Pair temp;
		lock.lock();
		try {
			pair.incrementX();
			pair.incrementY();
			temp = getPair();
		} finally {
			lock.unlock();
		}
		store(temp);
	}
	
}
