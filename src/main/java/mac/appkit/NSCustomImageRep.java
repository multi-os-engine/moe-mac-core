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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;
import mac.foundation.NSData;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCustomImageRep extends NSImageRep {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCustomImageRep(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCustomImageRep alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("drawSelector")
	public native SEL drawSelector();

	@Generated
	@Selector("imageRepClassForData:")
	public static native Class imageRepClassForData(NSData data);

	@Generated
	@Selector("imageRepClassForFileType:")
	public static native Class imageRepClassForFileType(String type);

	@Generated
	@Selector("imageRepClassForPasteboardType:")
	public static native Class imageRepClassForPasteboardType(String type);

	@Generated
	@Selector("imageRepClassForType:")
	public static native Class imageRepClassForType(String type);

	@Generated
	@Selector("imageRepWithContentsOfFile:")
	public static native NSCustomImageRep imageRepWithContentsOfFile(
			String filename);

	@Generated
	@Selector("imageRepWithContentsOfURL:")
	public static native NSCustomImageRep imageRepWithContentsOfURL(NSURL url);

	@Generated
	@Selector("imageRepWithPasteboard:")
	public static native NSCustomImageRep imageRepWithPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@Selector("imageRepsWithContentsOfFile:")
	public static native NSArray imageRepsWithContentsOfFile(String filename);

	@Generated
	@Selector("imageRepsWithContentsOfURL:")
	public static native NSArray imageRepsWithContentsOfURL(NSURL url);

	@Generated
	@Selector("imageRepsWithPasteboard:")
	public static native NSArray imageRepsWithPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("init")
	public native NSCustomImageRep init();

	@Generated
	@Selector("initWithDrawSelector:delegate:")
	public native NSCustomImageRep initWithDrawSelectorDelegate(SEL aMethod,
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("initWithSize:flipped:drawingHandler:")
	public native NSCustomImageRep initWithSizeFlippedDrawingHandler(
			@ByValue CGSize size,
			boolean drawingHandlerShouldBeCalledWithFlippedContext,
			@ObjCBlock(name = "call_initWithSizeFlippedDrawingHandler") Block_initWithSizeFlippedDrawingHandler drawingHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_initWithSizeFlippedDrawingHandler {
		@Generated
		public boolean call_initWithSizeFlippedDrawingHandler(
				@ByValue CGRect arg0);
	}
}
