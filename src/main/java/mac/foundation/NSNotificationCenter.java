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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNotificationCenter extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNotificationCenter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addObserver:selector:name:object:")
	public native void addObserverSelectorNameObject(
			@Mapped(ObjCObjectMapper.class) Object observer, SEL aSelector,
			String aName, @Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("addObserverForName:object:queue:usingBlock:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object addObserverForNameObjectQueueUsingBlock(
			String name,
			@Mapped(ObjCObjectMapper.class) Object obj,
			NSOperationQueue queue,
			@ObjCBlock(name = "call_addObserverForNameObjectQueueUsingBlock") Block_addObserverForNameObjectQueueUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_addObserverForNameObjectQueueUsingBlock {
		@Generated
		public void call_addObserverForNameObjectQueueUsingBlock(
				NSNotification arg0);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNotificationCenter alloc();

	@Generated
	@Selector("defaultCenter")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object defaultCenter();

	@Generated
	@Selector("init")
	public native NSNotificationCenter init();

	@Generated
	@Selector("postNotification:")
	public native void postNotification(NSNotification notification);

	@Generated
	@Selector("postNotificationName:object:")
	public native void postNotificationNameObject(String aName,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("postNotificationName:object:userInfo:")
	public native void postNotificationNameObjectUserInfo(String aName,
			@Mapped(ObjCObjectMapper.class) Object anObject,
			NSDictionary aUserInfo);

	@Generated
	@Selector("removeObserver:")
	public native void removeObserver(
			@Mapped(ObjCObjectMapper.class) Object observer);

	@Generated
	@Selector("removeObserver:name:object:")
	public native void removeObserverNameObject(
			@Mapped(ObjCObjectMapper.class) Object observer, String aName,
			@Mapped(ObjCObjectMapper.class) Object anObject);
}
