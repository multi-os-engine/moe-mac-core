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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.struct.NSEdgeInsets;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSStackView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSStackView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addView:inGravity:")
	public native void addViewInGravity(NSView aView, long gravity);

	@Generated
	@Selector("alignment")
	public native long alignment();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSStackView alloc();

	@Generated
	@Selector("clippingResistancePriorityForOrientation:")
	public native float clippingResistancePriorityForOrientation(
			long orientation);

	@Generated
	@Selector("customSpacingAfterView:")
	public native double customSpacingAfterView(NSView aView);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("detachedViews")
	public native NSArray detachedViews();

	@Generated
	@Selector("edgeInsets")
	@ByValue
	public native NSEdgeInsets edgeInsets();

	@Generated
	@Selector("hasEqualSpacing")
	public native boolean hasEqualSpacing();

	@Generated
	@Selector("huggingPriorityForOrientation:")
	public native float huggingPriorityForOrientation(long orientation);

	@Generated
	@Selector("init")
	public native NSStackView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSStackView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("insertView:atIndex:inGravity:")
	public native void insertViewAtIndexInGravity(NSView aView, long index,
			long gravity);

	@Generated
	@Selector("orientation")
	public native long orientation();

	@Generated
	@Selector("removeView:")
	public native void removeView(NSView aView);

	@Generated
	@Selector("setAlignment:")
	public native void setAlignment(long value);

	@Generated
	@Selector("setClippingResistancePriority:forOrientation:")
	public native void setClippingResistancePriorityForOrientation(
			float clippingResistancePriority, long orientation);

	@Generated
	@Selector("setCustomSpacing:afterView:")
	public native void setCustomSpacingAfterView(double spacing, NSView aView);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
		ObjCObject __old = (ObjCObject) delegate();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setEdgeInsets:")
	public native void setEdgeInsets(@ByValue NSEdgeInsets value);

	@Generated
	@Selector("setHasEqualSpacing:")
	public native void setHasEqualSpacing(boolean value);

	@Generated
	@Selector("setHuggingPriority:forOrientation:")
	public native void setHuggingPriorityForOrientation(float huggingPriority,
			long orientation);

	@Generated
	@Selector("setOrientation:")
	public native void setOrientation(long value);

	@Generated
	@Selector("setSpacing:")
	public native void setSpacing(double value);

	@Generated
	@Selector("setViews:inGravity:")
	public native void setViewsInGravity(NSArray views, long gravity);

	@Generated
	@Selector("setVisibilityPriority:forView:")
	public native void setVisibilityPriorityForView(float priority, NSView aView);

	@Generated
	@Selector("spacing")
	public native double spacing();

	@Generated
	@Selector("stackViewWithViews:")
	public static native NSStackView stackViewWithViews(NSArray views);

	@Generated
	@Selector("views")
	public native NSArray views();

	@Generated
	@Selector("viewsInGravity:")
	public native NSArray viewsInGravity(long gravity);

	@Generated
	@Selector("visibilityPriorityForView:")
	public native float visibilityPriorityForView(NSView aView);
}
