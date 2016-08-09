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
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTabView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTabView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addTabViewItem:")
	public native void addTabViewItem(NSTabViewItem tabViewItem);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTabView alloc();

	@Generated
	@Selector("allowsTruncatedLabels")
	public native boolean allowsTruncatedLabels();

	@Generated
	@Selector("contentRect")
	@ByValue
	public native CGRect contentRect();

	@Generated
	@Selector("controlSize")
	public native long controlSize();

	@Generated
	@Selector("controlTint")
	public native long controlTint();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("drawsBackground")
	public native boolean drawsBackground();

	@Generated
	@Selector("font")
	public native NSFont font();

	@Generated
	@Selector("indexOfTabViewItem:")
	public native long indexOfTabViewItem(NSTabViewItem tabViewItem);

	@Generated
	@Selector("indexOfTabViewItemWithIdentifier:")
	public native long indexOfTabViewItemWithIdentifier(
			@Mapped(ObjCObjectMapper.class) Object identifier);

	@Generated
	@Selector("init")
	public native NSTabView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSTabView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("insertTabViewItem:atIndex:")
	public native void insertTabViewItemAtIndex(NSTabViewItem tabViewItem,
			long index);

	@Generated
	@Selector("minimumSize")
	@ByValue
	public native CGSize minimumSize();

	@Generated
	@Selector("numberOfTabViewItems")
	public native long numberOfTabViewItems();

	@Generated
	@Selector("removeTabViewItem:")
	public native void removeTabViewItem(NSTabViewItem tabViewItem);

	@Generated
	@Selector("selectFirstTabViewItem:")
	public native void selectFirstTabViewItem(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectLastTabViewItem:")
	public native void selectLastTabViewItem(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectNextTabViewItem:")
	public native void selectNextTabViewItem(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectPreviousTabViewItem:")
	public native void selectPreviousTabViewItem(
			@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("selectTabViewItem:")
	public native void selectTabViewItem(NSTabViewItem tabViewItem);

	@Generated
	@Selector("selectTabViewItemAtIndex:")
	public native void selectTabViewItemAtIndex(long index);

	@Generated
	@Selector("selectTabViewItemWithIdentifier:")
	public native void selectTabViewItemWithIdentifier(
			@Mapped(ObjCObjectMapper.class) Object identifier);

	@Generated
	@Selector("selectedTabViewItem")
	public native NSTabViewItem selectedTabViewItem();

	@Generated
	@Selector("setAllowsTruncatedLabels:")
	public native void setAllowsTruncatedLabels(boolean allowTruncatedLabels);

	@Generated
	@Selector("setControlSize:")
	public native void setControlSize(long controlSize);

	@Generated
	@Selector("setControlTint:")
	public native void setControlTint(long controlTint);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setDrawsBackground:")
	public native void setDrawsBackground(boolean flag);

	@Generated
	@Selector("setFont:")
	public native void setFont(NSFont font);

	@Generated
	@Selector("setTabViewType:")
	public native void setTabViewType(long tabViewType);

	@Generated
	@Selector("tabViewItemAtIndex:")
	public native NSTabViewItem tabViewItemAtIndex(long index);

	@Generated
	@Selector("tabViewItemAtPoint:")
	public native NSTabViewItem tabViewItemAtPoint(@ByValue CGPoint point);

	@Generated
	@Selector("tabViewItems")
	public native NSArray tabViewItems();

	@Generated
	@Selector("tabViewType")
	public native long tabViewType();

	@Generated
	@Selector("takeSelectedTabViewItemFromSender:")
	public native void takeSelectedTabViewItemFromSender(
			@Mapped(ObjCObjectMapper.class) Object sender);
}
