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
import mac.NSObject;
import mac.foundation.NSArray;
import mac.foundation.NSIndexPath;
import mac.foundation.NSMutableArray;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSTreeNode extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSTreeNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSTreeNode alloc();

	@Generated
	@Selector("childNodes")
	public native NSArray childNodes();

	@Generated
	@Selector("descendantNodeAtIndexPath:")
	public native NSTreeNode descendantNodeAtIndexPath(NSIndexPath indexPath);

	@Generated
	@Selector("indexPath")
	public native NSIndexPath indexPath();

	@Generated
	@Selector("init")
	public native NSTreeNode init();

	@Generated
	@Selector("initWithRepresentedObject:")
	public native NSTreeNode initWithRepresentedObject(
			@Mapped(ObjCObjectMapper.class) Object modelObject);

	@Generated
	@Selector("isLeaf")
	public native boolean isLeaf();

	@Generated
	@Selector("mutableChildNodes")
	public native NSMutableArray mutableChildNodes();

	@Generated
	@Selector("parentNode")
	public native NSTreeNode parentNode();

	@Generated
	@Selector("representedObject")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object representedObject();

	@Generated
	@Selector("sortWithSortDescriptors:recursively:")
	public native void sortWithSortDescriptorsRecursively(
			NSArray sortDescriptors, boolean recursively);

	@Generated
	@Selector("treeNodeWithRepresentedObject:")
	public static native NSTreeNode treeNodeWithRepresentedObject(
			@Mapped(ObjCObjectMapper.class) Object modelObject);
}
