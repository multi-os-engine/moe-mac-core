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
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.opaque.CGImageRef;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSData;
import mac.foundation.NSDictionary;
import mac.foundation.NSURL;
import mac.quartzcore.CIImage;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBitmapImageRep extends NSImageRep {
	static {
		NatJ.register();
	}

	@Generated
	protected NSBitmapImageRep(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGImage")
	public native CGImageRef CGImage();

	@Generated
	@Selector("TIFFRepresentation")
	public native NSData TIFFRepresentation();

	@Generated
	@Selector("TIFFRepresentationOfImageRepsInArray:")
	public static native NSData TIFFRepresentationOfImageRepsInArray(
			NSArray array);

	@Generated
	@Selector("TIFFRepresentationOfImageRepsInArray:usingCompression:factor:")
	public static native NSData TIFFRepresentationOfImageRepsInArrayUsingCompressionFactor(
			NSArray array, long comp, float factor);

	@Generated
	@Selector("TIFFRepresentationUsingCompression:factor:")
	public native NSData TIFFRepresentationUsingCompressionFactor(long comp,
			float factor);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSBitmapImageRep alloc();

	@Generated
	@Selector("bitmapData")
	public native BytePtr bitmapData();

	@Generated
	@Selector("bitmapFormat")
	public native long bitmapFormat();

	@Generated
	@Selector("bitmapImageRepByConvertingToColorSpace:renderingIntent:")
	public native NSBitmapImageRep bitmapImageRepByConvertingToColorSpaceRenderingIntent(
			NSColorSpace targetSpace, long renderingIntent);

	@Generated
	@Selector("bitmapImageRepByRetaggingWithColorSpace:")
	public native NSBitmapImageRep bitmapImageRepByRetaggingWithColorSpace(
			NSColorSpace newSpace);

	@Generated
	@Selector("bitsPerPixel")
	public native long bitsPerPixel();

	@Generated
	@Selector("bytesPerPlane")
	public native long bytesPerPlane();

	@Generated
	@Selector("bytesPerRow")
	public native long bytesPerRow();

	@Generated
	@Selector("canBeCompressedUsing:")
	public native boolean canBeCompressedUsing(long compression);

	@Generated
	@Selector("colorAtX:y:")
	public native NSColor colorAtXY(long x, long y);

	@Generated
	@Selector("colorSpace")
	public native NSColorSpace colorSpace();

	@Generated
	@Selector("colorizeByMappingGray:toColor:blackMapping:whiteMapping:")
	public native void colorizeByMappingGrayToColorBlackMappingWhiteMapping(
			double midPoint, NSColor midPointColor, NSColor shadowColor,
			NSColor lightColor);

	@Generated
	@Selector("getBitmapDataPlanes:")
	public native void getBitmapDataPlanes(Ptr<BytePtr> data);

	@Generated
	@Selector("getCompression:factor:")
	public native void getCompressionFactor(LongPtr compression, FloatPtr factor);

	@Generated
	@Selector("getPixel:atX:y:")
	public native void getPixelAtXY(LongPtr p, long x, long y);

	@Generated
	@Selector("getTIFFCompressionTypes:count:")
	public static native void getTIFFCompressionTypesCount(
			Ptr<ConstLongPtr> list, LongPtr numTypes);

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
	public static native NSBitmapImageRep imageRepWithContentsOfFile(
			String filename);

	@Generated
	@Selector("imageRepWithContentsOfURL:")
	public static native NSBitmapImageRep imageRepWithContentsOfURL(NSURL url);

	@Generated
	@Selector("imageRepWithData:")
	public static native NSBitmapImageRep imageRepWithData(NSData data);

	@Generated
	@Selector("imageRepWithPasteboard:")
	public static native NSBitmapImageRep imageRepWithPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@Selector("imageRepsWithContentsOfFile:")
	public static native NSArray imageRepsWithContentsOfFile(String filename);

	@Generated
	@Selector("imageRepsWithContentsOfURL:")
	public static native NSArray imageRepsWithContentsOfURL(NSURL url);

	@Generated
	@Selector("imageRepsWithData:")
	public static native NSArray imageRepsWithData(NSData data);

	@Generated
	@Selector("imageRepsWithPasteboard:")
	public static native NSArray imageRepsWithPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("incrementalLoadFromData:complete:")
	public native long incrementalLoadFromDataComplete(NSData data,
			boolean complete);

	@Generated
	@Selector("init")
	public native NSBitmapImageRep init();

	@Generated
	@Selector("initForIncrementalLoad")
	public native NSBitmapImageRep initForIncrementalLoad();

	@Generated
	@Selector("initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bitmapFormat:bytesPerRow:bitsPerPixel:")
	public native NSBitmapImageRep initWithBitmapDataPlanesPixelsWidePixelsHighBitsPerSampleSamplesPerPixelHasAlphaIsPlanarColorSpaceNameBitmapFormatBytesPerRowBitsPerPixel(
			Ptr<BytePtr> planes, long width, long height, long bps, long spp,
			boolean alpha, boolean isPlanar, String colorSpaceName,
			long bitmapFormat, long rBytes, long pBits);

	@Generated
	@Selector("initWithBitmapDataPlanes:pixelsWide:pixelsHigh:bitsPerSample:samplesPerPixel:hasAlpha:isPlanar:colorSpaceName:bytesPerRow:bitsPerPixel:")
	public native NSBitmapImageRep initWithBitmapDataPlanesPixelsWidePixelsHighBitsPerSampleSamplesPerPixelHasAlphaIsPlanarColorSpaceNameBytesPerRowBitsPerPixel(
			Ptr<BytePtr> planes, long width, long height, long bps, long spp,
			boolean alpha, boolean isPlanar, String colorSpaceName,
			long rBytes, long pBits);

	@Generated
	@Selector("initWithCGImage:")
	public native NSBitmapImageRep initWithCGImage(CGImageRef cgImage);

	@Generated
	@Selector("initWithCIImage:")
	public native NSBitmapImageRep initWithCIImage(CIImage ciImage);

	@Generated
	@Selector("initWithData:")
	public native NSBitmapImageRep initWithData(NSData data);

	@Generated
	@Selector("initWithFocusedViewRect:")
	public native NSBitmapImageRep initWithFocusedViewRect(@ByValue CGRect rect);

	@Generated
	@Selector("isPlanar")
	public native boolean isPlanar();

	@Generated
	@Selector("localizedNameForTIFFCompressionType:")
	public static native String localizedNameForTIFFCompressionType(
			long compression);

	@Generated
	@Selector("numberOfPlanes")
	public native long numberOfPlanes();

	@Generated
	@Selector("representationOfImageRepsInArray:usingType:properties:")
	public static native NSData representationOfImageRepsInArrayUsingTypeProperties(
			NSArray imageReps, long storageType, NSDictionary properties);

	@Generated
	@Selector("representationUsingType:properties:")
	public native NSData representationUsingTypeProperties(long storageType,
			NSDictionary properties);

	@Generated
	@Selector("samplesPerPixel")
	public native long samplesPerPixel();

	@Generated
	@Selector("setColor:atX:y:")
	public native void setColorAtXY(NSColor color, long x, long y);

	@Generated
	@Selector("setCompression:factor:")
	public native void setCompressionFactor(long compression, float factor);

	@Generated
	@Selector("setPixel:atX:y:")
	public native void setPixelAtXY(LongPtr p, long x, long y);

	@Generated
	@Selector("setProperty:withValue:")
	public native void setPropertyWithValue(String property,
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("valueForProperty:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object valueForProperty(String property);
}
