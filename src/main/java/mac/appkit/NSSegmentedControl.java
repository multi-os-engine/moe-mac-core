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
public class NSSegmentedControl extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSegmentedControl(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSegmentedControl alloc();

	@Generated
	@Selector("imageForSegment:")
	public native NSImage imageForSegment(long segment);

	@Generated
	@Selector("imageScalingForSegment:")
	public native long imageScalingForSegment(long segment);

	@Generated
	@Selector("init")
	public native NSSegmentedControl init();

	@Generated
	@Selector("initWithFrame:")
	public native NSSegmentedControl initWithFrame(@ByValue CGRect frameRect);

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
	@Selector("setWidth:forSegment:")
	public native void setWidthForSegment(double width, long segment);

	@Generated
	@Selector("widthForSegment:")
	public native double widthForSegment(long segment);
}
