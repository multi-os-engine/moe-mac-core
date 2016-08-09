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
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;
import mac.foundation.NSURL;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPathControl extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPathControl(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPathControl alloc();

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
	public native NSPathControl init();

	@Generated
	@Selector("initWithFrame:")
	public native NSPathControl initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("menu")
	public native NSMenu menu();

	@Generated
	@Selector("pathComponentCells")
	public native NSArray pathComponentCells();

	@Generated
	@Selector("pathStyle")
	public native long pathStyle();

	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(NSColor color);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object delegate);

	@Generated
	@Selector("setDoubleAction:")
	public native void setDoubleAction(SEL action);

	@Generated
	@Selector("setDraggingSourceOperationMask:forLocal:")
	public native void setDraggingSourceOperationMaskForLocal(long mask,
			boolean isLocal);

	@Generated
	@Selector("setMenu:")
	public native void setMenu(NSMenu menu);

	@Generated
	@Selector("setPathComponentCells:")
	public native void setPathComponentCells(NSArray cells);

	@Generated
	@Selector("setPathStyle:")
	public native void setPathStyle(long style);

	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL url);
}
