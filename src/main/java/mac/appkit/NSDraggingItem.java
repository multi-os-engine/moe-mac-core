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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDraggingItem extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDraggingItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDraggingItem alloc();

	@Generated
	@Selector("draggingFrame")
	@ByValue
	public native CGRect draggingFrame();

	@Generated
	@Selector("imageComponents")
	public native NSArray imageComponents();

	@Generated
	@Selector("init")
	public native NSDraggingItem init();

	@Generated
	@Selector("initWithPasteboardWriter:")
	public native NSDraggingItem initWithPasteboardWriter(
			@Mapped(ObjCObjectMapper.class) Object pasteboardWriter);

	@Generated
	@Selector("item")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object item();

	@Generated
	@Selector("setDraggingFrame:")
	public native void setDraggingFrame(@ByValue CGRect value);

	@Generated
	@Selector("setDraggingFrame:contents:")
	public native void setDraggingFrameContents(@ByValue CGRect frame,
			@Mapped(ObjCObjectMapper.class) Object contents);

	@Generated
	@Selector("setImageComponentsProvider:")
	public native void setImageComponentsProvider(
			@ObjCBlock(name = "call_setImageComponentsProvider") Block_setImageComponentsProvider value);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_setImageComponentsProvider {
		@Generated
		public NSArray call_setImageComponentsProvider();
	}
}
