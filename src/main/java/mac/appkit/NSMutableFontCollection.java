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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.foundation.NSArray;
import mac.foundation.NSLocale;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSMutableFontCollection extends NSFontCollection {
	static {
		NatJ.register();
	}

	@Generated
	protected NSMutableFontCollection(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addQueryForDescriptors:")
	public native void addQueryForDescriptors(NSArray descriptors);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSMutableFontCollection alloc();

	@Generated
	@Selector("fontCollectionWithAllAvailableDescriptors")
	public static native NSMutableFontCollection fontCollectionWithAllAvailableDescriptors();

	@Generated
	@Selector("fontCollectionWithDescriptors:")
	public static native NSMutableFontCollection fontCollectionWithDescriptors(
			NSArray queryDescriptors);

	@Generated
	@Selector("fontCollectionWithLocale:")
	public static native NSMutableFontCollection fontCollectionWithLocale(
			NSLocale locale);

	@Generated
	@Selector("fontCollectionWithName:")
	public static native NSMutableFontCollection fontCollectionWithName(
			String name);

	@Generated
	@Selector("fontCollectionWithName:visibility:")
	public static native NSMutableFontCollection fontCollectionWithNameVisibility(
			String name, long visibility);

	@Generated
	@Selector("init")
	public native NSMutableFontCollection init();

	@Generated
	@Selector("removeQueryForDescriptors:")
	public native void removeQueryForDescriptors(NSArray descriptors);

	@Generated
	@Selector("setExclusionDescriptors:")
	public native void setExclusionDescriptors(NSArray descriptors);

	@Generated
	@Selector("setQueryDescriptors:")
	public native void setQueryDescriptors(NSArray descriptors);
}
