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
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSplitView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSplitView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adjustSubviews")
	public native void adjustSubviews();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSplitView alloc();

	@Generated
	@Selector("autosaveName")
	public native String autosaveName();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("dividerColor")
	public native NSColor dividerColor();

	@Generated
	@Selector("dividerStyle")
	public native long dividerStyle();

	@Generated
	@Selector("dividerThickness")
	public native double dividerThickness();

	@Generated
	@Selector("drawDividerInRect:")
	public native void drawDividerInRect(@ByValue CGRect rect);

	@Generated
	@Selector("holdingPriorityForSubviewAtIndex:")
	public native float holdingPriorityForSubviewAtIndex(long subviewIndex);

	@Generated
	@Selector("init")
	public native NSSplitView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSSplitView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isPaneSplitter")
	public native boolean isPaneSplitter();

	@Generated
	@Selector("isSubviewCollapsed:")
	public native boolean isSubviewCollapsed(NSView subview);

	@Generated
	@Selector("isVertical")
	public native boolean isVertical();

	@Generated
	@Selector("maxPossiblePositionOfDividerAtIndex:")
	public native double maxPossiblePositionOfDividerAtIndex(long dividerIndex);

	@Generated
	@Selector("minPossiblePositionOfDividerAtIndex:")
	public native double minPossiblePositionOfDividerAtIndex(long dividerIndex);

	@Generated
	@Selector("setAutosaveName:")
	public native void setAutosaveName(String autosaveName);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setDividerStyle:")
	public native void setDividerStyle(long dividerStyle);

	@Generated
	@Selector("setHoldingPriority:forSubviewAtIndex:")
	public native void setHoldingPriorityForSubviewAtIndex(float priority,
			long subviewIndex);

	@Generated
	@Selector("setIsPaneSplitter:")
	public native void setIsPaneSplitter(boolean flag);

	@Generated
	@Selector("setPosition:ofDividerAtIndex:")
	public native void setPositionOfDividerAtIndex(double position,
			long dividerIndex);

	@Generated
	@Selector("setVertical:")
	public native void setVertical(boolean flag);
}
