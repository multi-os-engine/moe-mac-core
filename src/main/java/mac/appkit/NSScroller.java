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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSScroller extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSScroller(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSScroller alloc();

	@Generated
	@Selector("arrowsPosition")
	public native long arrowsPosition();

	@Generated
	@Selector("checkSpaceForParts")
	public native void checkSpaceForParts();

	@Generated
	@Selector("controlSize")
	public native long controlSize();

	@Generated
	@Selector("controlTint")
	public native long controlTint();

	@Generated
	@Selector("drawArrow:highlight:")
	public native void drawArrowHighlight(long whichArrow, boolean flag);

	@Generated
	@Selector("drawKnob")
	public native void drawKnob();

	@Generated
	@Selector("drawKnobSlotInRect:highlight:")
	public native void drawKnobSlotInRectHighlight(@ByValue CGRect slotRect,
			boolean flag);

	@Generated
	@Selector("drawParts")
	public native void drawParts();

	@Generated
	@Selector("highlight:")
	public native void highlight(boolean flag);

	@Generated
	@Selector("hitPart")
	public native long hitPart();

	@Generated
	@Selector("init")
	public native NSScroller init();

	@Generated
	@Selector("initWithFrame:")
	public native NSScroller initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isCompatibleWithOverlayScrollers")
	public static native boolean isCompatibleWithOverlayScrollers();

	@Generated
	@Selector("knobProportion")
	public native double knobProportion();

	@Generated
	@Selector("knobStyle")
	public native long knobStyle();

	@Generated
	@Selector("preferredScrollerStyle")
	public static native long preferredScrollerStyle();

	@Generated
	@Selector("rectForPart:")
	@ByValue
	public native CGRect rectForPart(long partCode);

	@Generated
	@Selector("scrollerStyle")
	public native long scrollerStyle();

	@Generated
	@Selector("scrollerWidth")
	public static native double scrollerWidth();

	@Generated
	@Selector("scrollerWidthForControlSize:")
	public static native double scrollerWidthForControlSize(long controlSize);

	@Generated
	@Selector("scrollerWidthForControlSize:scrollerStyle:")
	public static native double scrollerWidthForControlSizeScrollerStyle(
			long controlSize, long scrollerStyle);

	@Generated
	@Selector("setArrowsPosition:")
	public native void setArrowsPosition(long where);

	@Generated
	@Selector("setControlSize:")
	public native void setControlSize(long controlSize);

	@Generated
	@Selector("setControlTint:")
	public native void setControlTint(long controlTint);

	@Generated
	@Selector("setFloatValue:knobProportion:")
	public native void setFloatValueKnobProportion(float aFloat,
			double proportion);

	@Generated
	@Selector("setKnobProportion:")
	public native void setKnobProportion(double proportion);

	@Generated
	@Selector("setKnobStyle:")
	public native void setKnobStyle(long newKnobStyle);

	@Generated
	@Selector("setScrollerStyle:")
	public native void setScrollerStyle(long newScrollerStyle);

	@Generated
	@Selector("testPart:")
	public native long testPart(@ByValue CGPoint thePoint);

	@Generated
	@Selector("trackKnob:")
	public native void trackKnob(NSEvent theEvent);

	@Generated
	@Selector("trackScrollButtons:")
	public native void trackScrollButtons(NSEvent theEvent);

	@Generated
	@Selector("usableParts")
	public native long usableParts();
}
