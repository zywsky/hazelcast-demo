package org.palm.hazelcast.map.listener;

import com.hazelcast.core.EntryEvent;
import com.hazelcast.map.listener.EntryAddedListener;
import com.hazelcast.map.listener.EntryRemovedListener;
import com.hazelcast.map.listener.EntryUpdatedListener;

public class ListenerExample implements EntryAddedListener<Integer, String>, EntryRemovedListener<Integer, String>, EntryUpdatedListener<Integer, String> {
	@Override
	public void entryUpdated(EntryEvent<Integer, String> entry) {//监听更新数据
		print("add entry. key = " + entry.getKey() + ". old value = " + entry.getMergingValue() + ". new value = " + entry.getMergingValue());
	}

	@Override
	public void entryRemoved(EntryEvent<Integer, String> entry) {//监听移除数据
		print("add entry. key = " + entry.getKey() + ". old value = " + entry.getMergingValue() + ". new value = " + entry.getMergingValue());
	}

	@Override
	public void entryAdded(EntryEvent<Integer, String> entry) {//监听新增数据
		print("add entry. key = " + entry.getKey() + ". old value = " + entry.getMergingValue() + ". new value = " + entry.getMergingValue());
	}
	
	private void print(Object obj){
		System.out.println(obj);
	}
}
