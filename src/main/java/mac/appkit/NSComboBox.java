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
import mac.coregraphics.struct.CGSize;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSComboBox extends NSTextField {
	static {
		NatJ.register();
	}

	@Generated
	protected NSComboBox(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addItemWithObjectValue:")
	public native void addItemWithObjectValue(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("addItemsWithObjectValues:")
	public native void addItemsWithObjectValues(NSArray objects);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSComboBox alloc();

	@Generated
	@Selector("completes")
	public native boolean completes();

	@Generated
	@Selector("dataSource")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object dataSource();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("deselectItemAtIndex:")
	public native void deselectItemAtIndex(long index);

	@Generated
	@Selector("hasVerticalScroller")
	public native boolean hasVerticalScroller();

	@Generated
	@Selector("indexOfItemWithObjectValue:")
	public native long indexOfItemWithObjectValue(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("indexOfSelectedItem")
	public native long indexOfSelectedItem();

	@Generated
	@Selector("init")
	public native NSComboBox init();

	@Generated
	@Selector("initWithFrame:")
	public native NSComboBox initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("insertItemWithObjectValue:atIndex:")
	public native void insertItemWithObjectValueAtIndex(
			@Mapped(ObjCObjectMapper.class) Object object, long index);

	@Generated
	@Selector("intercellSpacing")
	@ByValue
	public native CGSize intercellSpacing();

	@Generated
	@Selector("isButtonBordered")
	public native boolean isButtonBordered();

	@Generated
	@Selector("itemHeight")
	public native double itemHeight();

	@Generated
	@Selector("itemObjectValueAtIndex:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object itemObjectValueAtIndex(long index);

	@Generated
	@Selector("noteNumberOfItemsChanged")
	public native void noteNumberOfItemsChanged();

	@Generated
	@Selector("numberOfItems")
	public native long numberOfItems();

	@Generated
	@Selector("numberOfVisibleItems")
	public native long numberOfVisibleItems();

	@Generated
	@Selector("objectValueOfSelectedItem")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectValueOfSelectedItem();

	@Generated
	@Selector("objectValues")
	public native NSArray objectValues();

	@Generated
	@Selector("reloadData")
	public native void reloadData();

	@Generated
	@Selector("removeAllItems")
	public native void removeAllItems();

	@Generated
	@Selector("removeItemAtIndex:")
	public native void removeItemAtIndex(long index);

	@Generated
	@Selector("removeItemWithObjectValue:")
	public native void removeItemWithObjectValue(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("scrollItemAtIndexToTop:")
	public native void scrollItemAtIndexToTop(long index);

	@Generated
	@Selector("scrollItemAtIndexToVisible:")
	public native void scrollItemAtIndexToVisible(long index);

	@Generated
	@Selector("selectItemAtIndex:")
	public native void selectItemAtIndex(long index);

	@Generated
	@Selector("selectItemWithObjectValue:")
	public native void selectItemWithObjectValue(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("setButtonBordered:")
	public native void setButtonBordered(boolean flag);

	@Generated
	@Selector("setCompletes:")
	public native void setCompletes(boolean completes);

	@Generated
	@Selector("setDataSource:")
	public native void setDataSource(
			@Mapped(ObjCObjectMapper.class) Object aSource);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setHasVerticalScroller:")
	public native void setHasVerticalScroller(boolean flag);

	@Generated
	@Selector("setIntercellSpacing:")
	public native void setIntercellSpacing(@ByValue CGSize aSize);

	@Generated
	@Selector("setItemHeight:")
	public native void setItemHeight(double itemHeight);

	@Generated
	@Selector("setNumberOfVisibleItems:")
	public native void setNumberOfVisibleItems(long visibleItems);

	@Generated
	@Selector("setUsesDataSource:")
	public native void setUsesDataSource(boolean flag);

	@Generated
	@Selector("usesDataSource")
	public native boolean usesDataSource();
}
