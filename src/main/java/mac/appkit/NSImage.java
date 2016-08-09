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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.*;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.protocol.NSPasteboardReading;
import mac.appkit.protocol.NSPasteboardWriting;
import mac.coregraphics.opaque.CGImageRef;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.coreservices.opaque.IconRef;
import mac.foundation.*;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSImage extends NSObject implements NSCopying, NSCoding,
		NSPasteboardReading, NSPasteboardWriting {
	static {
		NatJ.register();
	}

	@Generated
	protected NSImage(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("CGImageForProposedRect:context:hints:")
	public native CGImageRef CGImageForProposedRectContextHints(
			@UncertainArgument("Options: reference, array Fallback: reference") CGRect proposedDestRect,
			NSGraphicsContext referenceContext, NSDictionary hints);

	@Generated
	@Selector("TIFFRepresentation")
	public native NSData TIFFRepresentation();

	@Generated
	@Selector("TIFFRepresentationUsingCompression:factor:")
	public native NSData TIFFRepresentationUsingCompressionFactor(long comp,
			float aFloat);

	@Generated
	@Selector("accessibilityDescription")
	public native String accessibilityDescription();

	@Generated
	@Selector("addRepresentation:")
	public native void addRepresentation(NSImageRep imageRep);

	@Generated
	@Selector("addRepresentations:")
	public native void addRepresentations(NSArray imageReps);

	@Generated
	@Selector("alignmentRect")
	@ByValue
	public native CGRect alignmentRect();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSImage alloc();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("bestRepresentationForDevice:")
	public native NSImageRep bestRepresentationForDevice(
			NSDictionary deviceDescription);

	@Generated
	@Selector("bestRepresentationForRect:context:hints:")
	public native NSImageRep bestRepresentationForRectContextHints(
			@ByValue CGRect rect, NSGraphicsContext referenceContext,
			NSDictionary hints);

	@Generated
	@Selector("cacheDepthMatchesImageDepth")
	public native boolean cacheDepthMatchesImageDepth();

	@Generated
	@Selector("cacheMode")
	public native long cacheMode();

	@Generated
	@Selector("canInitWithPasteboard:")
	public static native boolean canInitWithPasteboard(NSPasteboard pasteboard);

	@Generated
	@Selector("cancelIncrementalLoad")
	public native void cancelIncrementalLoad();

	@Generated
	@Selector("compositeToPoint:fromRect:operation:")
	public native void compositeToPointFromRectOperation(
			@ByValue CGPoint point, @ByValue CGRect rect, long op);

	@Generated
	@Selector("compositeToPoint:fromRect:operation:fraction:")
	public native void compositeToPointFromRectOperationFraction(
			@ByValue CGPoint point, @ByValue CGRect rect, long op, double delta);

	@Generated
	@Selector("compositeToPoint:operation:")
	public native void compositeToPointOperation(@ByValue CGPoint point, long op);

	@Generated
	@Selector("compositeToPoint:operation:fraction:")
	public native void compositeToPointOperationFraction(
			@ByValue CGPoint point, long op, double delta);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("dissolveToPoint:fraction:")
	public native void dissolveToPointFraction(@ByValue CGPoint point,
			double aFloat);

	@Generated
	@Selector("dissolveToPoint:fromRect:fraction:")
	public native void dissolveToPointFromRectFraction(@ByValue CGPoint point,
			@ByValue CGRect rect, double aFloat);

	@Generated
	@Selector("drawAtPoint:fromRect:operation:fraction:")
	public native void drawAtPointFromRectOperationFraction(
			@ByValue CGPoint point, @ByValue CGRect fromRect, long op,
			double delta);

	@Generated
	@Selector("drawInRect:")
	public native void drawInRect(@ByValue CGRect rect);

	@Generated
	@Selector("drawInRect:fromRect:operation:fraction:")
	public native void drawInRectFromRectOperationFraction(
			@ByValue CGRect rect, @ByValue CGRect fromRect, long op,
			double delta);

	@Generated
	@Selector("drawInRect:fromRect:operation:fraction:respectFlipped:hints:")
	public native void drawInRectFromRectOperationFractionRespectFlippedHints(
			@ByValue CGRect dstSpacePortionRect,
			@ByValue CGRect srcSpacePortionRect, long op,
			double requestedAlpha, boolean respectContextIsFlipped,
			NSDictionary hints);

	@Generated
	@Selector("drawRepresentation:inRect:")
	public native boolean drawRepresentationInRect(NSImageRep imageRep,
			@ByValue CGRect rect);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("hitTestRect:withImageDestinationRect:context:hints:flipped:")
	public native boolean hitTestRectWithImageDestinationRectContextHintsFlipped(
			@ByValue CGRect testRectDestSpace,
			@ByValue CGRect imageRectDestSpace, NSGraphicsContext context,
			NSDictionary hints, boolean flipped);

	@Generated
	@Selector("imageFileTypes")
	public static native NSArray imageFileTypes();

	@Generated
	@Selector("imageNamed:")
	public static native NSImage imageNamed(String name);

	@Generated
	@Selector("imagePasteboardTypes")
	public static native NSArray imagePasteboardTypes();

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
	@Selector("imageWithSize:flipped:drawingHandler:")
	public static native NSImage imageWithSizeFlippedDrawingHandler(
			@ByValue CGSize size,
			boolean drawingHandlerShouldBeCalledWithFlippedContext,
			@ObjCBlock(name = "call_imageWithSizeFlippedDrawingHandler") Block_imageWithSizeFlippedDrawingHandler drawingHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_imageWithSizeFlippedDrawingHandler {
		@Generated
		public boolean call_imageWithSizeFlippedDrawingHandler(
				@ByValue CGRect arg0);
	}

	@Generated
	@Selector("init")
	public native NSImage init();

	@Generated
	@Selector("initByReferencingFile:")
	public native NSImage initByReferencingFile(String fileName);

	@Generated
	@Selector("initByReferencingURL:")
	public native NSImage initByReferencingURL(NSURL url);

	@Generated
	@Selector("initWithCGImage:size:")
	public native NSImage initWithCGImageSize(CGImageRef cgImage,
			@ByValue CGSize size);

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithContentsOfFile:")
	public native NSImage initWithContentsOfFile(String fileName);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSImage initWithContentsOfURL(NSURL url);

	@Generated
	@Selector("initWithData:")
	public native NSImage initWithData(NSData data);

	@Generated
	@Selector("initWithDataIgnoringOrientation:")
	public native NSImage initWithDataIgnoringOrientation(NSData data);

	@Generated
	@Selector("initWithIconRef:")
	public native NSImage initWithIconRef(IconRef iconRef);

	@Generated
	@Selector("initWithPasteboard:")
	public native NSImage initWithPasteboard(NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("initWithPasteboardPropertyList:ofType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithPasteboardPropertyListOfType(
			@Mapped(ObjCObjectMapper.class) Object propertyList, String type);

	@Generated
	@Selector("initWithSize:")
	public native NSImage initWithSize(@ByValue CGSize aSize);

	@Generated
	@Selector("isCachedSeparately")
	public native boolean isCachedSeparately();

	@Generated
	@Selector("isDataRetained")
	public native boolean isDataRetained();

	@Generated
	@Selector("isFlipped")
	public native boolean isFlipped();

	@Generated
	@Selector("isTemplate")
	public native boolean isTemplate();

	@Generated
	@Selector("isValid")
	public native boolean isValid();

	@Generated
	@Selector("layerContentsForContentsScale:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object layerContentsForContentsScale(double layerContentsScale);

	@Generated
	@Selector("lockFocus")
	public native void lockFocus();

	@Generated
	@Selector("lockFocusFlipped:")
	public native void lockFocusFlipped(boolean flipped);

	@Generated
	@Selector("lockFocusOnRepresentation:")
	public native void lockFocusOnRepresentation(NSImageRep imageRepresentation);

	@Generated
	@Selector("matchesOnMultipleResolution")
	public native boolean matchesOnMultipleResolution();

	@Generated
	@Selector("matchesOnlyOnBestFittingAxis")
	public native boolean matchesOnlyOnBestFittingAxis();

	@Generated
	@Selector("name")
	public native String name();

	@Generated
	@Selector("pasteboardPropertyListForType:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object pasteboardPropertyListForType(String type);

	@Generated
	@Selector("prefersColorMatch")
	public native boolean prefersColorMatch();

	@Generated
	@Selector("readableTypesForPasteboard:")
	public static native NSArray readableTypesForPasteboard(
			NSPasteboard pasteboard);

	@Generated
	@ProtocolClassMethod("readableTypesForPasteboard")
	public NSArray _readableTypesForPasteboard(NSPasteboard pasteboard) {
		return readableTypesForPasteboard(pasteboard);
	}

	@Generated
	@IsOptional
	@Selector("readingOptionsForType:pasteboard:")
	public static native long readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@ProtocolClassMethod("readingOptionsForTypePasteboard")
	public long _readingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard) {
		return readingOptionsForTypePasteboard(type, pasteboard);
	}

	@Generated
	@Selector("recache")
	public native void recache();

	@Generated
	@Selector("recommendedLayerContentsScale:")
	public native double recommendedLayerContentsScale(
			double preferredContentsScale);

	@Generated
	@Selector("removeRepresentation:")
	public native void removeRepresentation(NSImageRep imageRep);

	@Generated
	@Selector("representations")
	public native NSArray representations();

	@Generated
	@Selector("scalesWhenResized")
	public native boolean scalesWhenResized();

	@Generated
	@Selector("setAccessibilityDescription:")
	public native void setAccessibilityDescription(String description);

	@Generated
	@Selector("setAlignmentRect:")
	public native void setAlignmentRect(@ByValue CGRect rect);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor aColor);

	@Generated
	@Selector("setCacheDepthMatchesImageDepth:")
	public native void setCacheDepthMatchesImageDepth(boolean flag);

	@Generated
	@Selector("setCacheMode:")
	public native void setCacheMode(long mode);

	@Generated
	@Selector("setCachedSeparately:")
	public native void setCachedSeparately(boolean flag);

	@Generated
	@Selector("setDataRetained:")
	public native void setDataRetained(boolean flag);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setFlipped:")
	public native void setFlipped(boolean flag);

	@Generated
	@Selector("setMatchesOnMultipleResolution:")
	public native void setMatchesOnMultipleResolution(boolean flag);

	@Generated
	@Selector("setMatchesOnlyOnBestFittingAxis:")
	public native void setMatchesOnlyOnBestFittingAxis(boolean flag);

	@Generated
	@Selector("setName:")
	public native boolean setName(String string);

	@Generated
	@Selector("setPrefersColorMatch:")
	public native void setPrefersColorMatch(boolean flag);

	@Generated
	@Selector("setScalesWhenResized:")
	public native void setScalesWhenResized(boolean flag);

	@Generated
	@Selector("setSize:")
	public native void setSize(@ByValue CGSize aSize);

	@Generated
	@Selector("setTemplate:")
	public native void setTemplate(boolean isTemplate);

	@Generated
	@Selector("setUsesEPSOnResolutionMismatch:")
	public native void setUsesEPSOnResolutionMismatch(boolean flag);

	@Generated
	@Selector("size")
	@ByValue
	public native CGSize size();

	@Generated
	@Selector("unlockFocus")
	public native void unlockFocus();

	@Generated
	@Selector("usesEPSOnResolutionMismatch")
	public native boolean usesEPSOnResolutionMismatch();

	@Generated
	@Selector("writableTypesForPasteboard:")
	public native NSArray writableTypesForPasteboard(NSPasteboard pasteboard);

	@Generated
	@IsOptional
	@Selector("writingOptionsForType:pasteboard:")
	public native long writingOptionsForTypePasteboard(String type,
			NSPasteboard pasteboard);
}
