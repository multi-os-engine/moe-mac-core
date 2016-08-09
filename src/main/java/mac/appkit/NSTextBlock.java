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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;
import mac.foundation.struct.NSRange;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTextBlock extends NSObject implements NSCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTextBlock(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTextBlock alloc();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("borderColorForEdge:")
	public native NSColor borderColorForEdge(long edge);

	@Generated
	@Selector("boundsRectForContentRect:inRect:textContainer:characterRange:")
	@ByValue
	public native CGRect boundsRectForContentRectInRectTextContainerCharacterRange(
			@ByValue CGRect contentRect, @ByValue CGRect rect,
			NSTextContainer textContainer, @ByValue NSRange charRange);

	@Generated
	@Selector("contentWidth")
	public native double contentWidth();

	@Generated
	@Selector("contentWidthValueType")
	public native long contentWidthValueType();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("drawBackgroundWithFrame:inView:characterRange:layoutManager:")
	public native void drawBackgroundWithFrameInViewCharacterRangeLayoutManager(
			@ByValue CGRect frameRect, NSView controlView,
			@ByValue NSRange charRange, NSLayoutManager layoutManager);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSTextBlock init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("rectForLayoutAtPoint:inRect:textContainer:characterRange:")
	@ByValue
	public native CGRect rectForLayoutAtPointInRectTextContainerCharacterRange(
			@ByValue CGPoint startingPoint, @ByValue CGRect rect,
			NSTextContainer textContainer, @ByValue NSRange charRange);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setBorderColor:")
	public native void setBorderColor(NSColor color);

	@Generated
	@Selector("setBorderColor:forEdge:")
	public native void setBorderColorForEdge(NSColor color, long edge);

	@Generated
	@Selector("setContentWidth:type:")
	public native void setContentWidthType(double val, long type);

	@Generated
	@Selector("setValue:type:forDimension:")
	public native void setValueTypeForDimension(double val, long type,
			long dimension);

	@Generated
	@Selector("setVerticalAlignment:")
	public native void setVerticalAlignment(long alignment);

	@Generated
	@Selector("setWidth:type:forLayer:")
	public native void setWidthTypeForLayer(double val, long type, long layer);

	@Generated
	@Selector("setWidth:type:forLayer:edge:")
	public native void setWidthTypeForLayerEdge(double val, long type,
			long layer, long edge);

	@Generated
	@Selector("valueForDimension:")
	public native double valueForDimension(long dimension);

	@Generated
	@Selector("valueTypeForDimension:")
	public native long valueTypeForDimension(long dimension);

	@Generated
	@Selector("verticalAlignment")
	public native long verticalAlignment();

	@Generated
	@Selector("widthForLayer:edge:")
	public native double widthForLayerEdge(long layer, long edge);

	@Generated
	@Selector("widthValueTypeForLayer:edge:")
	public native long widthValueTypeForLayerEdge(long layer, long edge);
}
