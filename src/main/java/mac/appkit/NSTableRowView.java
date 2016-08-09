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
public class NSTableRowView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTableRowView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTableRowView alloc();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("draggingDestinationFeedbackStyle")
	public native long draggingDestinationFeedbackStyle();

	@Generated
	@Selector("drawBackgroundInRect:")
	public native void drawBackgroundInRect(@ByValue CGRect dirtyRect);

	@Generated
	@Selector("drawDraggingDestinationFeedbackInRect:")
	public native void drawDraggingDestinationFeedbackInRect(
			@ByValue CGRect dirtyRect);

	@Generated
	@Selector("drawSelectionInRect:")
	public native void drawSelectionInRect(@ByValue CGRect dirtyRect);

	@Generated
	@Selector("drawSeparatorInRect:")
	public native void drawSeparatorInRect(@ByValue CGRect dirtyRect);

	@Generated
	@Selector("indentationForDropOperation")
	public native double indentationForDropOperation();

	@Generated
	@Selector("init")
	public native NSTableRowView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSTableRowView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("interiorBackgroundStyle")
	public native long interiorBackgroundStyle();

	@Generated
	@Selector("isEmphasized")
	public native boolean isEmphasized();

	@Generated
	@Selector("isFloating")
	public native boolean isFloating();

	@Generated
	@Selector("isGroupRowStyle")
	public native boolean isGroupRowStyle();

	@Generated
	@Selector("isSelected")
	public native boolean isSelected();

	@Generated
	@Selector("isTargetForDropOperation")
	public native boolean isTargetForDropOperation();

	@Generated
	@Selector("numberOfColumns")
	public native long numberOfColumns();

	@Generated
	@Selector("selectionHighlightStyle")
	public native long selectionHighlightStyle();

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor value);

	@Generated
	@Selector("setDraggingDestinationFeedbackStyle:")
	public native void setDraggingDestinationFeedbackStyle(long value);

	@Generated
	@Selector("setEmphasized:")
	public native void setEmphasized(boolean value);

	@Generated
	@Selector("setFloating:")
	public native void setFloating(boolean value);

	@Generated
	@Selector("setGroupRowStyle:")
	public native void setGroupRowStyle(boolean value);

	@Generated
	@Selector("setIndentationForDropOperation:")
	public native void setIndentationForDropOperation(double value);

	@Generated
	@Selector("setSelected:")
	public native void setSelected(boolean value);

	@Generated
	@Selector("setSelectionHighlightStyle:")
	public native void setSelectionHighlightStyle(long value);

	@Generated
	@Selector("setTargetForDropOperation:")
	public native void setTargetForDropOperation(boolean value);

	@Generated
	@Selector("viewAtColumn:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object viewAtColumn(long column);
}
