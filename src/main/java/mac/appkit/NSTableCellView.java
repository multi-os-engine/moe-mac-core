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
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGRect;
import mac.foundation.NSArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTableCellView extends NSView {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTableCellView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTableCellView alloc();

	@Generated
	@Selector("backgroundStyle")
	public native long backgroundStyle();

	@Generated
	@Selector("draggingImageComponents")
	public native NSArray draggingImageComponents();

	@Generated
	@Selector("imageView")
	public native NSImageView imageView();

	@Generated
	@Selector("init")
	public native NSTableCellView init();

	@Generated
	@Selector("initWithFrame:")
	public native NSTableCellView initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("objectValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectValue();

	@Generated
	@Selector("rowSizeStyle")
	public native long rowSizeStyle();

	@Generated
	@Selector("setBackgroundStyle:")
	public native void setBackgroundStyle(long value);

	@Generated
	@Selector("setImageView:")
	public native void setImageView_unsafe(NSImageView value);

	@Generated
	public void setImageView(NSImageView value) {
		ObjCObject __old = (ObjCObject) imageView();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setImageView_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("setObjectValue:")
	public native void setObjectValue(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	@Selector("setRowSizeStyle:")
	public native void setRowSizeStyle(long value);

	@Generated
	@Selector("setTextField:")
	public native void setTextField_unsafe(NSTextField value);

	@Generated
	public void setTextField(NSTextField value) {
		ObjCObject __old = (ObjCObject) textField();
		if (value != null) {
			ObjCRuntime.associateObjCObject(this, value);
		}
		setTextField_unsafe(value);
		if (__old != null) {
			ObjCRuntime
					.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("textField")
	public native NSTextField textField();
}
