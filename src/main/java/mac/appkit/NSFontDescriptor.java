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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.*;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFontDescriptor extends NSObject implements NSCopying, NSCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSFontDescriptor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSFontDescriptor alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("fontAttributes")
	public native NSDictionary fontAttributes();

	@Generated
	@Selector("fontDescriptorByAddingAttributes:")
	public native NSFontDescriptor fontDescriptorByAddingAttributes(
			NSDictionary attributes);

	@Generated
	@Selector("fontDescriptorWithFace:")
	public native NSFontDescriptor fontDescriptorWithFace(String newFace);

	@Generated
	@Selector("fontDescriptorWithFamily:")
	public native NSFontDescriptor fontDescriptorWithFamily(String newFamily);

	@Generated
	@Selector("fontDescriptorWithFontAttributes:")
	public static native NSFontDescriptor fontDescriptorWithFontAttributes(
			NSDictionary attributes);

	@Generated
	@Selector("fontDescriptorWithMatrix:")
	public native NSFontDescriptor fontDescriptorWithMatrix(
			NSAffineTransform matrix);

	@Generated
	@Selector("fontDescriptorWithName:matrix:")
	public static native NSFontDescriptor fontDescriptorWithNameMatrix(
			String fontName, NSAffineTransform matrix);

	@Generated
	@Selector("fontDescriptorWithName:size:")
	public static native NSFontDescriptor fontDescriptorWithNameSize(
			String fontName, double size);

	@Generated
	@Selector("fontDescriptorWithSize:")
	public native NSFontDescriptor fontDescriptorWithSize(double newPointSize);

	@Generated
	@Selector("fontDescriptorWithSymbolicTraits:")
	public native NSFontDescriptor fontDescriptorWithSymbolicTraits(
			int symbolicTraits);

	@Generated
	@Selector("init")
	public native NSFontDescriptor init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFontAttributes:")
	public native NSFontDescriptor initWithFontAttributes(
			NSDictionary attributes);

	@Generated
	@Selector("matchingFontDescriptorWithMandatoryKeys:")
	public native NSFontDescriptor matchingFontDescriptorWithMandatoryKeys(
			NSSet mandatoryKeys);

	@Generated
	@Selector("matchingFontDescriptorsWithMandatoryKeys:")
	public native NSArray matchingFontDescriptorsWithMandatoryKeys(
			NSSet mandatoryKeys);

	@Generated
	@Selector("matrix")
	public native NSAffineTransform matrix();

	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(String anAttribute);

	@Generated
	@Selector("pointSize")
	public native double pointSize();

	@Generated
	@Selector("postscriptName")
	public native String postscriptName();

	@Generated
	@Selector("symbolicTraits")
	public native int symbolicTraits();
}
