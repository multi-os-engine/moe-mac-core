/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMetadataQuery extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMetadataQuery(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMetadataQuery alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("disableUpdates")
	public native void disableUpdates();

	@Generated
	@Selector("enableUpdates")
	public native void enableUpdates();

	@Generated
	@Selector("enumerateResultsUsingBlock:")
	public native void enumerateResultsUsingBlock(
			@ObjCBlock(name = "call_enumerateResultsUsingBlock") Block_enumerateResultsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateResultsUsingBlock {
		@Generated
		public void call_enumerateResultsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("enumerateResultsWithOptions:usingBlock:")
	public native void enumerateResultsWithOptionsUsingBlock(
			long opts,
			@ObjCBlock(name = "call_enumerateResultsWithOptionsUsingBlock") Block_enumerateResultsWithOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateResultsWithOptionsUsingBlock {
		@Generated
		public void call_enumerateResultsWithOptionsUsingBlock(
				@Mapped(ObjCObjectMapper.class) Object arg0, long arg1,
				BoolPtr arg2);
	}

	@Generated
	@Selector("groupedResults")
	public native NSArray groupedResults();

	@Generated
	@Selector("groupingAttributes")
	public native NSArray groupingAttributes();

	@Generated
	@Selector("indexOfResult:")
	public native long indexOfResult(
			@Mapped(ObjCObjectMapper.class) Object result);

	@Generated
	@Selector("init")
	public native NSMetadataQuery init();

	@Generated
	@Selector("isGathering")
	public native boolean isGathering();

	@Generated
	@Selector("isStarted")
	public native boolean isStarted();

	@Generated
	@Selector("isStopped")
	public native boolean isStopped();

	@Generated
	@Selector("notificationBatchingInterval")
	public native double notificationBatchingInterval();

	@Generated
	@Selector("operationQueue")
	public native NSOperationQueue operationQueue();

	@Generated
	@Selector("predicate")
	public native NSPredicate predicate();

	@Generated
	@Selector("resultAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object resultAtIndex(long idx);

	@Generated
	@Selector("resultCount")
	public native long resultCount();

	@Generated
	@Selector("results")
	public native NSArray results();

	@Generated
	@Selector("searchItems")
	public native NSArray searchItems();

	@Generated
	@Selector("searchScopes")
	public native NSArray searchScopes();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setGroupingAttributes:")
	public native void setGroupingAttributes(NSArray attrs);

	@Generated
	@Selector("setNotificationBatchingInterval:")
	public native void setNotificationBatchingInterval(double ti);

	@Generated
	@Selector("setOperationQueue:")
	public native void setOperationQueue(NSOperationQueue operationQueue);

	@Generated
	@Selector("setPredicate:")
	public native void setPredicate(NSPredicate predicate);

	@Generated
	@Selector("setSearchItems:")
	public native void setSearchItems(NSArray items);

	@Generated
	@Selector("setSearchScopes:")
	public native void setSearchScopes(NSArray scopes);

	@Generated
	@Selector("setSortDescriptors:")
	public native void setSortDescriptors(NSArray descriptors);

	@Generated
	@Selector("setValueListAttributes:")
	public native void setValueListAttributes(NSArray attrs);

	@Generated
	@Selector("sortDescriptors")
	public native NSArray sortDescriptors();

	@Generated
	@Selector("startQuery")
	public native boolean startQuery();

	@Generated
	@Selector("stopQuery")
	public native void stopQuery();

	@Generated
	@Selector("valueListAttributes")
	public native NSArray valueListAttributes();

	@Generated
	@Selector("valueLists")
	public native NSDictionary valueLists();

	@Generated
	@Selector("valueOfAttribute:forResultAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueOfAttributeForResultAtIndex(String attrName,
			long idx);
}
