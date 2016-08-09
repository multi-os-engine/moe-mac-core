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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.foundation.NSArray;
import mac.foundation.NSDictionary;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDraggingSession extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDraggingSession(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDraggingSession alloc();

	@Generated
	@Selector("animatesToStartingPositionsOnCancelOrFail")
	public native boolean animatesToStartingPositionsOnCancelOrFail();

	@Generated
	@Selector("draggingFormation")
	public native long draggingFormation();

	@Generated
	@Selector("draggingLeaderIndex")
	public native long draggingLeaderIndex();

	@Generated
	@Selector("draggingLocation")
	@ByValue
	public native CGPoint draggingLocation();

	@Generated
	@Selector("draggingPasteboard")
	public native NSPasteboard draggingPasteboard();

	@Generated
	@Selector("draggingSequenceNumber")
	public native long draggingSequenceNumber();

	@Generated
	@Selector("enumerateDraggingItemsWithOptions:forView:classes:searchOptions:usingBlock:")
	public native void enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock(
			long enumOpts,
			NSView view,
			NSArray classArray,
			NSDictionary searchOptions,
			@ObjCBlock(name = "call_enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock") Block_enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock {
		@Generated
		public void call_enumerateDraggingItemsWithOptionsForViewClassesSearchOptionsUsingBlock(
				NSDraggingItem arg0, long arg1, BoolPtr arg2);
	}

	@Generated
	@Selector("init")
	public native NSDraggingSession init();

	@Generated
	@Selector("setAnimatesToStartingPositionsOnCancelOrFail:")
	public native void setAnimatesToStartingPositionsOnCancelOrFail(
			boolean value);

	@Generated
	@Selector("setDraggingFormation:")
	public native void setDraggingFormation(long value);

	@Generated
	@Selector("setDraggingLeaderIndex:")
	public native void setDraggingLeaderIndex(long value);
}
