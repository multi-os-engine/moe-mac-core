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

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSArchiver extends NSCoder {
	static {
		NatJ.register();
	}

	@Generated
	protected NSArchiver(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSArchiver alloc();

	@Generated
	@Selector("archiveRootObject:toFile:")
	public static native boolean archiveRootObjectToFile(
			@Mapped(ObjCObjectMapper.class) Object rootObject, String path);

	@Generated
	@Selector("archivedDataWithRootObject:")
	public static native NSData archivedDataWithRootObject(
			@Mapped(ObjCObjectMapper.class) Object rootObject);

	@Generated
	@Selector("archiverData")
	public native NSMutableData archiverData();

	@Generated
	@Selector("classNameEncodedForTrueClassName:")
	public native String classNameEncodedForTrueClassName(String trueName);

	@Generated
	@Selector("encodeClassName:intoClassName:")
	public native void encodeClassNameIntoClassName(String trueName,
			String inArchiveName);

	@Generated
	@Selector("encodeConditionalObject:")
	public native void encodeConditionalObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("encodeRootObject:")
	public native void encodeRootObject(
			@Mapped(ObjCObjectMapper.class) Object rootObject);

	@Generated
	@Selector("init")
	public native NSArchiver init();

	@Generated
	@Selector("initForWritingWithMutableData:")
	public native NSArchiver initForWritingWithMutableData(NSMutableData mdata);

	@Generated
	@Selector("replaceObject:withObject:")
	public native void replaceObjectWithObject(
			@Mapped(ObjCObjectMapper.class) Object object,
			@Mapped(ObjCObjectMapper.class) Object newObject);
}
