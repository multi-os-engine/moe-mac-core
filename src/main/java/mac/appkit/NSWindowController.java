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
import mac.foundation.NSCoder;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSWindowController extends NSResponder implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSWindowController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSWindowController alloc();

	@Generated
	@Selector("close")
	public native void close();

	@Generated
	@Selector("document")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object document();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSWindowController init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithWindow:")
	public native NSWindowController initWithWindow(NSWindow window);

	@Generated
	@Selector("initWithWindowNibName:")
	public native NSWindowController initWithWindowNibName(String windowNibName);

	@Generated
	@Selector("initWithWindowNibName:owner:")
	public native NSWindowController initWithWindowNibNameOwner(
			String windowNibName, @Mapped(ObjCObjectMapper.class) Object owner);

	@Generated
	@Selector("initWithWindowNibPath:owner:")
	public native NSWindowController initWithWindowNibPathOwner(
			String windowNibPath, @Mapped(ObjCObjectMapper.class) Object owner);

	@Generated
	@Selector("isWindowLoaded")
	public native boolean isWindowLoaded();

	@Generated
	@Selector("loadWindow")
	public native void loadWindow();

	@Generated
	@Selector("owner")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object owner();

	@Generated
	@Selector("setDocument:")
	public native void setDocument(NSDocument document);

	@Generated
	@Selector("setDocumentEdited:")
	public native void setDocumentEdited(boolean dirtyFlag);

	@Generated
	@Selector("setShouldCascadeWindows:")
	public native void setShouldCascadeWindows(boolean flag);

	@Generated
	@Selector("setShouldCloseDocument:")
	public native void setShouldCloseDocument(boolean flag);

	@Generated
	@Selector("setWindow:")
	public native void setWindow(NSWindow window);

	@Generated
	@Selector("setWindowFrameAutosaveName:")
	public native void setWindowFrameAutosaveName(String name);

	@Generated
	@Selector("shouldCascadeWindows")
	public native boolean shouldCascadeWindows();

	@Generated
	@Selector("shouldCloseDocument")
	public native boolean shouldCloseDocument();

	@Generated
	@Selector("showWindow:")
	public native void showWindow(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("synchronizeWindowTitleWithDocumentName")
	public native void synchronizeWindowTitleWithDocumentName();

	@Generated
	@Selector("window")
	public native NSWindow window();

	@Generated
	@Selector("windowDidLoad")
	public native void windowDidLoad();

	@Generated
	@Selector("windowFrameAutosaveName")
	public native String windowFrameAutosaveName();

	@Generated
	@Selector("windowNibName")
	public native String windowNibName();

	@Generated
	@Selector("windowNibPath")
	public native String windowNibPath();

	@Generated
	@Selector("windowTitleForDocumentDisplayName:")
	public native String windowTitleForDocumentDisplayName(String displayName);

	@Generated
	@Selector("windowWillLoad")
	public native void windowWillLoad();
}
