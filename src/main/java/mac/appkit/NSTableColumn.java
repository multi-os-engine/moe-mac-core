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
import mac.NSObject;
import mac.appkit.protocol.NSUserInterfaceItemIdentification;
import mac.foundation.NSCoder;
import mac.foundation.NSSortDescriptor;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTableColumn extends NSObject implements NSCoding,
		NSUserInterfaceItemIdentification {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTableColumn(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTableColumn alloc();

	@Generated
	@Selector("dataCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object dataCell();

	@Generated
	@Selector("dataCellForRow:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object dataCellForRow(long row);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("headerCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object headerCell();

	@Generated
	@Selector("headerToolTip")
	public native String headerToolTip();

	@Generated
	@Selector("identifier")
	public native String identifier();

	@Generated
	@Selector("init")
	public native NSTableColumn init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithIdentifier:")
	public native NSTableColumn initWithIdentifier(String identifier);

	@Generated
	@Selector("isEditable")
	public native boolean isEditable();

	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	@Generated
	@Selector("isResizable")
	public native boolean isResizable();

	@Generated
	@Selector("maxWidth")
	public native double maxWidth();

	@Generated
	@Selector("minWidth")
	public native double minWidth();

	@Generated
	@Selector("resizingMask")
	public native long resizingMask();

	@Generated
	@Selector("setDataCell:")
	public native void setDataCell(NSCell cell);

	@Generated
	@Selector("setEditable:")
	public native void setEditable(boolean flag);

	@Generated
	@Selector("setHeaderCell:")
	public native void setHeaderCell(NSCell cell);

	@Generated
	@Selector("setHeaderToolTip:")
	public native void setHeaderToolTip(String string);

	@Generated
	@Selector("setHidden:")
	public native void setHidden(boolean hidden);

	@Generated
	@Selector("setIdentifier:")
	public native void setIdentifier(String identifier);

	@Generated
	@Selector("setMaxWidth:")
	public native void setMaxWidth(double maxWidth);

	@Generated
	@Selector("setMinWidth:")
	public native void setMinWidth(double minWidth);

	@Generated
	@Selector("setResizable:")
	public native void setResizable(boolean flag);

	@Generated
	@Selector("setResizingMask:")
	public native void setResizingMask(long resizingMask);

	@Generated
	@Selector("setSortDescriptorPrototype:")
	public native void setSortDescriptorPrototype(
			NSSortDescriptor sortDescriptor);

	@Generated
	@Selector("setTableView:")
	public native void setTableView(NSTableView tableView);

	@Generated
	@Selector("setWidth:")
	public native void setWidth(double width);

	@Generated
	@Selector("sizeToFit")
	public native void sizeToFit();

	@Generated
	@Selector("sortDescriptorPrototype")
	public native NSSortDescriptor sortDescriptorPrototype();

	@Generated
	@Selector("tableView")
	public native NSTableView tableView();

	@Generated
	@Selector("width")
	public native double width();
}
