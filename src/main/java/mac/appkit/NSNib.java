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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.*;
import mac.foundation.protocol.NSCoding;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSNib extends NSObject implements NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSNib(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSNib alloc();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSNib init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithContentsOfURL:")
	public native NSNib initWithContentsOfURL(NSURL nibFileURL);

	@Generated
	@Selector("initWithNibData:bundle:")
	public native NSNib initWithNibDataBundle(NSData nibData, NSBundle bundle);

	@Generated
	@Selector("initWithNibNamed:bundle:")
	public native NSNib initWithNibNamedBundle(String nibName, NSBundle bundle);

	@Generated
	@Selector("instantiateNibWithExternalNameTable:")
	public native boolean instantiateNibWithExternalNameTable(
			NSDictionary externalNameTable);

	@Generated
	@Selector("instantiateNibWithOwner:topLevelObjects:")
	public native boolean instantiateNibWithOwnerTopLevelObjects(
			@Mapped(ObjCObjectMapper.class) Object owner,
			Ptr<NSArray> topLevelObjects);

	@Generated
	@Selector("instantiateWithOwner:topLevelObjects:")
	public native boolean instantiateWithOwnerTopLevelObjects(
			@Mapped(ObjCObjectMapper.class) Object owner,
			Ptr<NSArray> topLevelObjects);
}
