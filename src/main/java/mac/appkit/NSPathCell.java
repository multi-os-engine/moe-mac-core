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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.protocol.NSOpenSavePanelDelegate;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSAttributedString;
import mac.foundation.NSError;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPathCell extends NSActionCell implements NSOpenSavePanelDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPathCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPathCell alloc();

	@Generated
	@Selector("allowedTypes")
	public native NSArray allowedTypes();

	@Generated
	@Selector("backgroundColor")
	public native NSColor backgroundColor();

	@Generated
	@Selector("clickedPathComponentCell")
	public native NSPathComponentCell clickedPathComponentCell();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("doubleAction")
	public native SEL doubleAction();

	@Generated
	@Selector("init")
	public native NSPathCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSPathCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSPathCell initTextCell(String aString);

	@Generated
	@Selector("mouseEntered:withFrame:inView:")
	public native void mouseEnteredWithFrameInView(NSEvent event,
			@ByValue CGRect frame, NSView view);

	@Generated
	@Selector("mouseExited:withFrame:inView:")
	public native void mouseExitedWithFrameInView(NSEvent event,
			@ByValue CGRect frame, NSView view);

	@Generated
	@IsOptional
	@Selector("panel:didChangeToDirectoryURL:")
	public native void panelDidChangeToDirectoryURL(
			@Mapped(ObjCObjectMapper.class) Object sender, NSURL url);

	@Generated
	@IsOptional
	@Selector("panel:shouldEnableURL:")
	public native boolean panelShouldEnableURL(
			@Mapped(ObjCObjectMapper.class) Object sender, NSURL url);

	@Generated
	@IsOptional
	@Selector("panel:userEnteredFilename:confirmed:")
	public native String panelUserEnteredFilenameConfirmed(
			@Mapped(ObjCObjectMapper.class) Object sender, String filename,
			boolean okFlag);

	@Generated
	@IsOptional
	@Selector("panel:validateURL:error:")
	public native boolean panelValidateURLError(
			@Mapped(ObjCObjectMapper.class) Object sender, NSURL url,
			Ptr<NSError> outError);

	@Generated
	@IsOptional
	@Selector("panel:willExpand:")
	public native void panelWillExpand(
			@Mapped(ObjCObjectMapper.class) Object sender, boolean expanding);

	@Generated
	@IsOptional
	@Selector("panelSelectionDidChange:")
	public native void panelSelectionDidChange(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("pathComponentCellAtPoint:withFrame:inView:")
	public native NSPathComponentCell pathComponentCellAtPointWithFrameInView(
			@ByValue CGPoint point, @ByValue CGRect frame, NSView view);

	@Generated
	@Selector("pathComponentCellClass")
	public static native Class pathComponentCellClass();

	@Generated
	@Selector("pathComponentCells")
	public native NSArray pathComponentCells();

	@Generated
	@Selector("pathStyle")
	public native long pathStyle();

	@Generated
	@Selector("placeholderAttributedString")
	public native NSAttributedString placeholderAttributedString();

	@Generated
	@Selector("placeholderString")
	public native String placeholderString();

	@Generated
	@Selector("rectOfPathComponentCell:withFrame:inView:")
	@ByValue
	public native CGRect rectOfPathComponentCellWithFrameInView(
			NSPathComponentCell cell, @ByValue CGRect frame, NSView view);

	@Generated
	@Selector("setAllowedTypes:")
	public native void setAllowedTypes(NSArray allowedTypes);

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setControlSize:")
	public native void setControlSize(long size);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setDoubleAction:")
	public native void setDoubleAction(SEL action);

	@Generated
	@Selector("setObjectValue:")
	public native void setObjectValue(@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("setPathComponentCells:")
	public native void setPathComponentCells(NSArray cells);

	@Generated
	@Selector("setPathStyle:")
	public native void setPathStyle(long style);

	@Generated
	@Selector("setPlaceholderAttributedString:")
	public native void setPlaceholderAttributedString(NSAttributedString string);

	@Generated
	@Selector("setPlaceholderString:")
	public native void setPlaceholderString(String string);

	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL url);
}
