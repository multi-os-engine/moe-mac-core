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
public class NSTableHeaderView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTableHeaderView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTableHeaderView alloc();

	@Generated
	@Selector("columnAtPoint:")
	public native long columnAtPoint(@ByValue CGPoint point);

	@Generated
	@Selector("draggedColumn")
	public native long draggedColumn();

	@Generated
	@Selector("draggedDistance")
	public native double draggedDistance();

	@Generated
	@Selector("headerRectOfColumn:")
	@ByValue
	public native CGRect headerRectOfColumn(long column);

	@Generated
	@Selector("init")
	public native NSTableHeaderView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSTableHeaderView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("resizedColumn")
	public native long resizedColumn();

	@Generated
	@Selector("setTableView:")
	public native void setTableView(NSTableView tableView);

	@Generated
	@Selector("tableView")
	public native NSTableView tableView();
}
