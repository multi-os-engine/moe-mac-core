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
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSearchFieldCell extends NSTextFieldCell {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSearchFieldCell(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSearchFieldCell alloc();

	@Generated
	@Selector("cancelButtonCell")
	public native NSButtonCell cancelButtonCell();

	@Generated
	@Selector("cancelButtonRectForBounds:")
	@ByValue
	public native CGRect cancelButtonRectForBounds(@ByValue CGRect rect);

	@Generated
	@Selector("init")
	public native NSSearchFieldCell init();

	@Generated
	@Selector("initImageCell:")
	public native NSSearchFieldCell initImageCell(NSImage image);

	@Generated
	@Selector("initTextCell:")
	public native NSSearchFieldCell initTextCell(String aString);

	@Generated
	@Selector("maximumRecents")
	public native long maximumRecents();

	@Generated
	@Selector("recentSearches")
	public native NSArray recentSearches();

	@Generated
	@Selector("recentsAutosaveName")
	public native String recentsAutosaveName();

	@Generated
	@Selector("resetCancelButtonCell")
	public native void resetCancelButtonCell();

	@Generated
	@Selector("resetSearchButtonCell")
	public native void resetSearchButtonCell();

	@Generated
	@Selector("searchButtonCell")
	public native NSButtonCell searchButtonCell();

	@Generated
	@Selector("searchButtonRectForBounds:")
	@ByValue
	public native CGRect searchButtonRectForBounds(@ByValue CGRect rect);

	@Generated
	@Selector("searchMenuTemplate")
	public native NSMenu searchMenuTemplate();

	@Generated
	@Selector("searchTextRectForBounds:")
	@ByValue
	public native CGRect searchTextRectForBounds(@ByValue CGRect rect);

	@Generated
	@Selector("sendsSearchStringImmediately")
	public native boolean sendsSearchStringImmediately();

	@Generated
	@Selector("sendsWholeSearchString")
	public native boolean sendsWholeSearchString();

	@Generated
	@Selector("setCancelButtonCell:")
	public native void setCancelButtonCell(NSButtonCell cell);

	@Generated
	@Selector("setMaximumRecents:")
	public native void setMaximumRecents(long maxRecents);

	@Generated
	@Selector("setRecentSearches:")
	public native void setRecentSearches(NSArray searches);

	@Generated
	@Selector("setRecentsAutosaveName:")
	public native void setRecentsAutosaveName(String string);

	@Generated
	@Selector("setSearchButtonCell:")
	public native void setSearchButtonCell(NSButtonCell cell);

	@Generated
	@Selector("setSearchMenuTemplate:")
	public native void setSearchMenuTemplate(NSMenu menu);

	@Generated
	@Selector("setSendsSearchStringImmediately:")
	public native void setSendsSearchStringImmediately(boolean flag);

	@Generated
	@Selector("setSendsWholeSearchString:")
	public native void setSendsWholeSearchString(boolean flag);
}
