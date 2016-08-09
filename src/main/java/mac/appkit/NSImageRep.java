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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.opaque.CGImageRef;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.*;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSImageRep extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSImageRep(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGImageForProposedRect:context:hints:")
	public native CGImageRef CGImageForProposedRectContextHints(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect proposedDestRect,
			NSGraphicsContext context, NSDictionary hints);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSImageRep alloc();

	@Generated
	@Selector("bitsPerSample")
	public native long bitsPerSample();

	@Generated
	@Selector("canInitWithData:")
	public static native boolean canInitWithData(NSData data);

	@Generated
	@Selector("canInitWithPasteboard:")
	public static native boolean canInitWithPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("colorSpaceName")
	public native String colorSpaceName();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("draw")
	public native boolean draw();

	@Generated
	@Selector("drawAtPoint:")
	public native boolean drawAtPoint(@ByValue CGPoint point);

	@Generated
	@Selector("drawInRect:")
	public native boolean drawInRect(@ByValue CGRect rect);

	@Generated
	@Selector("drawInRect:fromRect:operation:fraction:respectFlipped:hints:")
	public native boolean drawInRectFromRectOperationFractionRespectFlippedHints(
			@ByValue CGRect dstSpacePortionRect,
			@ByValue CGRect srcSpacePortionRect, long op,
			double requestedAlpha, boolean respectContextIsFlipped,
			NSDictionary hints);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("hasAlpha")
	public native boolean hasAlpha();

	@Generated
	@Selector("imageFileTypes")
	public static native NSArray imageFileTypes();

	@Generated
	@Selector("imagePasteboardTypes")
	public static native NSArray imagePasteboardTypes();

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
	public static native NSImageRep imageRepWithContentsOfFile(String filename);

	@Generated
	@Selector("imageRepWithContentsOfURL:")
	public static native NSImageRep imageRepWithContentsOfURL(NSURL url);

	@Generated
	@Selector("imageRepWithPasteboard:")
	public static native NSImageRep imageRepWithPasteboard(
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
	@Selector("imageTypes")
	public static native NSArray imageTypes();

	@Generated
	@Selector("imageUnfilteredFileTypes")
	public static native NSArray imageUnfilteredFileTypes();

	@Generated
	@Selector("imageUnfilteredPasteboardTypes")
	public static native NSArray imageUnfilteredPasteboardTypes();

	@Generated
	@Selector("imageUnfilteredTypes")
	public static native NSArray imageUnfilteredTypes();

	@Generated
	@Selector("init")
	public native NSImageRep init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("isOpaque")
	public native boolean isOpaque();

	@Generated
	@Selector("pixelsHigh")
	public native long pixelsHigh();

	@Generated
	@Selector("pixelsWide")
	public native long pixelsWide();

	@Generated
	@Selector("registerImageRepClass:")
	public static native void registerImageRepClass(Class imageRepClass);

	@Generated
	@Selector("registeredImageRepClasses")
	public static native NSArray registeredImageRepClasses();

	@Generated
	@Selector("setAlpha:")
	public native void setAlpha(boolean flag);

	@Generated
	@Selector("setBitsPerSample:")
	public native void setBitsPerSample(long anInt);

	@Generated
	@Selector("setColorSpaceName:")
	public native void setColorSpaceName(String string);

	@Generated
	@Selector("setOpaque:")
	public native void setOpaque(boolean flag);

	@Generated
	@Selector("setPixelsHigh:")
	public native void setPixelsHigh(long anInt);

	@Generated
	@Selector("setPixelsWide:")
	public native void setPixelsWide(long anInt);

	@Generated
	@Selector("setSize:")
	public native void setSize(@ByValue CGSize aSize);

	@Generated
	@Selector("size")
	@ByValue
	public native CGSize size();

	@Generated
	@Selector("unregisterImageRepClass:")
	public static native void unregisterImageRepClass(Class imageRepClass);
}
