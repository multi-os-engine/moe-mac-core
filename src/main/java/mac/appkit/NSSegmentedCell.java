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
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSegmentedCell extends NSActionCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSegmentedCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSegmentedCell alloc();

	@Generated
	@Selector("drawSegment:inFrame:withView:")
	public native void drawSegmentInFrameWithView(long segment,
			@ByValue CGRect frame, NSView controlView);

	@Generated
	@Selector("imageForSegment:")
	public native NSImage imageForSegment(long segment);

	@Generated
	@Selector("imageScalingForSegment:")
	public native long imageScalingForSegment(long segment);

	@Generated
	@Selector("init")
	public native NSSegmentedCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSSegmentedCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSSegmentedCell initTextCell(String aString);

	@Generated
	@Selector("interiorBackgroundStyleForSegment:")
	public native long interiorBackgroundStyleForSegment(long segment);

	@Generated
	@Selector("isEnabledForSegment:")
	public native boolean isEnabledForSegment(long segment);

	@Generated
	@Selector("isSelectedForSegment:")
	public native boolean isSelectedForSegment(long segment);

	@Generated
	@Selector("labelForSegment:")
	public native String labelForSegment(long segment);

	@Generated
	@Selector("makeNextSegmentKey")
	public native void makeNextSegmentKey();

	@Generated
	@Selector("makePreviousSegmentKey")
	public native void makePreviousSegmentKey();

	@Generated
	@Selector("menuForSegment:")
	public native NSMenu menuForSegment(long segment);

	@Generated
	@Selector("segmentCount")
	public native long segmentCount();

	@Generated
	@Selector("segmentStyle")
	public native long segmentStyle();

	@Generated
	@Selector("selectSegmentWithTag:")
	public native boolean selectSegmentWithTag(long tag);

	@Generated
	@Selector("selectedSegment")
	public native long selectedSegment();

	@Generated
	@Selector("setEnabled:forSegment:")
	public native void setEnabledForSegment(boolean enabled, long segment);

	@Generated
	@Selector("setImage:forSegment:")
	public native void setImageForSegment(NSImage image, long segment);

	@Generated
	@Selector("setImageScaling:forSegment:")
	public native void setImageScalingForSegment(long scaling, long segment);

	@Generated
	@Selector("setLabel:forSegment:")
	public native void setLabelForSegment(String label, long segment);

	@Generated
	@Selector("setMenu:forSegment:")
	public native void setMenuForSegment(NSMenu menu, long segment);

	@Generated
	@Selector("setSegmentCount:")
	public native void setSegmentCount(long count);

	@Generated
	@Selector("setSegmentStyle:")
	public native void setSegmentStyle(long segmentStyle);

	@Generated
	@Selector("setSelected:forSegment:")
	public native void setSelectedForSegment(boolean selected, long segment);

	@Generated
	@Selector("setSelectedSegment:")
	public native void setSelectedSegment(long selectedSegment);

	@Generated
	@Selector("setTag:forSegment:")
	public native void setTagForSegment(long tag, long segment);

	@Generated
	@Selector("setToolTip:forSegment:")
	public native void setToolTipForSegment(String toolTip, long segment);

	@Generated
	@Selector("setTrackingMode:")
	public native void setTrackingMode(long trackingMode);

	@Generated
	@Selector("setWidth:forSegment:")
	public native void setWidthForSegment(double width, long segment);

	@Generated
	@Selector("tagForSegment:")
	public native long tagForSegment(long segment);

	@Generated
	@Selector("toolTipForSegment:")
	public native String toolTipForSegment(long segment);

	@Generated
	@Selector("trackingMode")
	public native long trackingMode();

	@Generated
	@Selector("widthForSegment:")
	public native double widthForSegment(long segment);
}
