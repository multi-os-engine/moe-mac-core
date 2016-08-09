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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSArray;
import mac.foundation.NSBundle;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCollectionViewItem extends NSViewController implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCollectionViewItem(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCollectionViewItem alloc();

	@Generated
	@Selector("collectionView")
	public native NSCollectionView collectionView();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("draggingImageComponents")
	public native NSArray draggingImageComponents();

	@Generated
	@Selector("imageView")
	public native NSImageView imageView();

	@Generated
	@Selector("init")
	public native NSCollectionViewItem init();

	@Generated
	@Selector("initWithNibName:bundle:")
	public native NSCollectionViewItem initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("isSelected")
	public native boolean isSelected();

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
	@Selector("setSelected:")
	public native void setSelected(boolean value);

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
