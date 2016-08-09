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

package mac.quartzcore;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.NSBitmapImageRep;
import mac.coregraphics.opaque.CGColorSpaceRef;
import mac.coregraphics.opaque.CGImageRef;
import mac.coregraphics.struct.CGAffineTransform;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.corevideo.opaque.CVBufferRef;
import mac.foundation.*;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.opengl.opaque.IOSurfaceRef;

@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIImage extends NSObject implements NSCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected CIImage(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CIImage alloc();

	@Generated
	@Selector("autoAdjustmentFilters")
	public native NSArray autoAdjustmentFilters();

	@Generated
	@Selector("autoAdjustmentFiltersWithOptions:")
	public native NSArray autoAdjustmentFiltersWithOptions(NSDictionary dict);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("drawAtPoint:fromRect:operation:fraction:")
	public native void drawAtPointFromRectOperationFraction(
			@ByValue CGPoint point, @ByValue CGRect fromRect, long op,
			double delta);

	@Generated
	@Selector("drawInRect:fromRect:operation:fraction:")
	public native void drawInRectFromRectOperationFraction(
			@ByValue CGRect rect, @ByValue CGRect fromRect, long op,
			double delta);

	@Generated
	@Selector("emptyImage")
	public static native CIImage emptyImage();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("extent")
	@ByValue
	public native CGRect extent();

	@Generated
	@Selector("imageByApplyingTransform:")
	public native CIImage imageByApplyingTransform(
			@ByValue CGAffineTransform matrix);

	@Generated
	@Selector("imageByCroppingToRect:")
	public native CIImage imageByCroppingToRect(@ByValue CGRect r);

	@Generated
	@Selector("imageWithBitmapData:bytesPerRow:size:format:colorSpace:")
	public static native CIImage imageWithBitmapDataBytesPerRowSizeFormatColorSpace(
			NSData d, long bpr, @ByValue CGSize size, int f, CGColorSpaceRef cs);

	@Generated
	@Selector("imageWithCGImage:")
	public static native CIImage imageWithCGImage(CGImageRef image);

	@Generated
	@Selector("imageWithCGImage:options:")
	public static native CIImage imageWithCGImageOptions(CGImageRef image,
			NSDictionary d);

	@Generated
	@Selector("imageWithCVPixelBuffer:")
	public static native CIImage imageWithCVPixelBuffer(CVBufferRef buffer);

	@Generated
	@Selector("imageWithCVPixelBuffer:options:")
	public static native CIImage imageWithCVPixelBufferOptions(
			CVBufferRef buffer, NSDictionary dict);

	@Generated
	@Selector("imageWithColor:")
	public static native CIImage imageWithColor(CIColor color);

	@Generated
	@Selector("imageWithContentsOfURL:")
	public static native CIImage imageWithContentsOfURL(NSURL url);

	@Generated
	@Selector("imageWithContentsOfURL:options:")
	public static native CIImage imageWithContentsOfURLOptions(NSURL url,
			NSDictionary d);

	@Generated
	@Selector("imageWithData:")
	public static native CIImage imageWithData(NSData data);

	@Generated
	@Selector("imageWithData:options:")
	public static native CIImage imageWithDataOptions(NSData data,
			NSDictionary d);

	@Generated
	@Selector("imageWithTexture:size:flipped:colorSpace:")
	public static native CIImage imageWithTextureSizeFlippedColorSpace(
			int name, @ByValue CGSize size, boolean flag, CGColorSpaceRef cs);

	@Generated
	@Selector("init")
	public native CIImage init();

	@Generated
	@Selector("initWithBitmapData:bytesPerRow:size:format:colorSpace:")
	public native CIImage initWithBitmapDataBytesPerRowSizeFormatColorSpace(
			NSData d, long bpr, @ByValue CGSize size, int f, CGColorSpaceRef c);

	@Generated
	@Selector("initWithBitmapImageRep:")
	public native CIImage initWithBitmapImageRep(NSBitmapImageRep bitmapImageRep);

	@Generated
	@Selector("initWithCGImage:")
	public native CIImage initWithCGImage(CGImageRef image);

	@Generated
	@Selector("initWithCGImage:options:")
	public native CIImage initWithCGImageOptions(CGImageRef image,
			NSDictionary d);

	@Generated
	@Selector("initWithCVPixelBuffer:")
	public native CIImage initWithCVPixelBuffer(CVBufferRef buffer);

	@Generated
	@Selector("initWithCVPixelBuffer:options:")
	public native CIImage initWithCVPixelBufferOptions(CVBufferRef buffer,
			NSDictionary dict);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithColor:")
	public native CIImage initWithColor(CIColor color);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native CIImage initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithContentsOfURL:options:")
	public native CIImage initWithContentsOfURLOptions(NSURL url, NSDictionary d);

	@Generated
	@Selector("initWithData:")
	public native CIImage initWithData(NSData data);

	@Generated
	@Selector("initWithData:options:")
	public native CIImage initWithDataOptions(NSData data, NSDictionary d);

	@Generated
	@Selector("initWithIOSurface:plane:format:options:")
	public native CIImage initWithIOSurfacePlaneFormatOptions(
			IOSurfaceRef surface, long plane, int format, NSDictionary d);

	@Generated
	@Selector("initWithTexture:size:flipped:colorSpace:")
	public native CIImage initWithTextureSizeFlippedColorSpace(int name,
			@ByValue CGSize size, boolean flag, CGColorSpaceRef cs);

	@Generated
	@Selector("properties")
	public native NSDictionary properties();
}
