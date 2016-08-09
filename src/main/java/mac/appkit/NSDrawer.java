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
import mac.coregraphics.struct.CGSize;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDrawer extends NSResponder {
	static {
		NatJ.register();
	}

	@Generated
	protected NSDrawer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSDrawer alloc();

	@Generated
	@Selector("close")
	public native void close();

	@Generated
	@Selector("close:")
	public native void close(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("contentSize")
	@ByValue
	public native CGSize contentSize();

	@Generated
	@Selector("contentView")
	public native NSView contentView();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("edge")
	public native long edge();

	@Generated
	@Selector("init")
	public native NSDrawer init();

	@Generated
	@Selector("initWithContentSize:preferredEdge:")
	public native NSDrawer initWithContentSizePreferredEdge(
			@ByValue CGSize contentSize, long edge);

	@Generated
	@Selector("leadingOffset")
	public native double leadingOffset();

	@Generated
	@Selector("maxContentSize")
	@ByValue
	public native CGSize maxContentSize();

	@Generated
	@Selector("minContentSize")
	@ByValue
	public native CGSize minContentSize();

	@Generated
	@Selector("open")
	public native void open();

	@Generated
	@Selector("open:")
	public native void open(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("openOnEdge:")
	public native void openOnEdge(long edge);

	@Generated
	@Selector("parentWindow")
	public native NSWindow parentWindow();

	@Generated
	@Selector("preferredEdge")
	public native long preferredEdge();

	@Generated
	@Selector("setContentSize:")
	public native void setContentSize(@ByValue CGSize size);

	@Generated
	@Selector("setContentView:")
	public native void setContentView(NSView aView);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate(
			@Mapped(ObjCObjectMapper.class) Object anObject);

	@Generated
	@Selector("setLeadingOffset:")
	public native void setLeadingOffset(double offset);

	@Generated
	@Selector("setMaxContentSize:")
	public native void setMaxContentSize(@ByValue CGSize size);

	@Generated
	@Selector("setMinContentSize:")
	public native void setMinContentSize(@ByValue CGSize size);

	@Generated
	@Selector("setParentWindow:")
	public native void setParentWindow(NSWindow parent);

	@Generated
	@Selector("setPreferredEdge:")
	public native void setPreferredEdge(long edge);

	@Generated
	@Selector("setTrailingOffset:")
	public native void setTrailingOffset(double offset);

	@Generated
	@Selector("state")
	public native long state();

	@Generated
	@Selector("toggle:")
	public native void toggle(@Mapped(ObjCObjectMapper.class) Object sender);

	@Generated
	@Selector("trailingOffset")
	public native double trailingOffset();
}
