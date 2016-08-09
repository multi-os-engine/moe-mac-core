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
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSForm extends NSMatrix {
	static {
		NatJ.register();
	}

	@Generated
	protected NSForm(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addEntry:")
	public native NSFormCell addEntry(String title);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSForm alloc();

	@Generated
	@Selector("cellAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object cellAtIndex(long index);

	@Generated
	@Selector("drawCellAtIndex:")
	public native void drawCellAtIndex(long index);

	@Generated
	@Selector("indexOfCellWithTag:")
	public native long indexOfCellWithTag(long aTag);

	@Generated
	@Selector("indexOfSelectedItem")
	public native long indexOfSelectedItem();

	@Generated
	@Selector("init")
	public native NSForm init();

	@Generated
	@Selector("initWithFrame:")
	public native NSForm initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("initWithFrame:mode:cellClass:numberOfRows:numberOfColumns:")
	public native NSForm initWithFrameModeCellClassNumberOfRowsNumberOfColumns(
			@ByValue CGRect frameRect, long aMode, Class factoryId,
			long rowsHigh, long colsWide);

	@Generated
	@Selector("initWithFrame:mode:prototype:numberOfRows:numberOfColumns:")
	public native NSForm initWithFrameModePrototypeNumberOfRowsNumberOfColumns(
			@ByValue CGRect frameRect, long aMode, NSCell aCell, long rowsHigh,
			long colsWide);

	@Generated
	@Selector("insertEntry:atIndex:")
	public native NSFormCell insertEntryAtIndex(String title, long index);

	@Generated
	@Selector("preferredTextFieldWidth")
	public native double preferredTextFieldWidth();

	@Generated
	@Selector("removeEntryAtIndex:")
	public native void removeEntryAtIndex(long index);

	@Generated
	@Selector("selectTextAtIndex:")
	public native void selectTextAtIndex(long index);

	@Generated
	@Selector("setBezeled:")
	public native void setBezeled(boolean flag);

	@Generated
	@Selector("setBordered:")
	public native void setBordered(boolean flag);

	@Generated
	@Selector("setEntryWidth:")
	public native void setEntryWidth(double width);

	@Generated
	@Selector("setFrameSize:")
	public native void setFrameSize(@ByValue CGSize newSize);

	@Generated
	@Selector("setInterlineSpacing:")
	public native void setInterlineSpacing(double spacing);

	@Generated
	@Selector("setPreferredTextFieldWidth:")
	public native void setPreferredTextFieldWidth(double preferredWidth);

	@Generated
	@Selector("setTextAlignment:")
	public native void setTextAlignment(long mode);

	@Generated
	@Selector("setTextBaseWritingDirection:")
	public native void setTextBaseWritingDirection(long writingDirection);

	@Generated
	@Selector("setTextFont:")
	public native void setTextFont(NSFont fontObj);

	@Generated
	@Selector("setTitleAlignment:")
	public native void setTitleAlignment(long mode);

	@Generated
	@Selector("setTitleBaseWritingDirection:")
	public native void setTitleBaseWritingDirection(long writingDirection);

	@Generated
	@Selector("setTitleFont:")
	public native void setTitleFont(NSFont fontObj);
}
