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
import mac.foundation.NSArray;
import mac.foundation.NSCoder;
import mac.foundation.NSPredicate;
import mac.foundation.protocol.NSCoding;
import mac.foundation.protocol.NSCopying;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPredicateEditorRowTemplate extends NSObject implements NSCoding,
		NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPredicateEditorRowTemplate(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPredicateEditorRowTemplate alloc();

	@Generated
	@Selector("compoundTypes")
	public native NSArray compoundTypes();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("displayableSubpredicatesOfPredicate:")
	public native NSArray displayableSubpredicatesOfPredicate(
			NSPredicate predicate);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native NSPredicateEditorRowTemplate init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithCompoundTypes:")
	public native NSPredicateEditorRowTemplate initWithCompoundTypes(
			NSArray compoundTypes);

	@Generated
	@Selector("initWithLeftExpressions:rightExpressionAttributeType:modifier:operators:options:")
	public native NSPredicateEditorRowTemplate initWithLeftExpressionsRightExpressionAttributeTypeModifierOperatorsOptions(
			NSArray leftExpressions, long attributeType, long modifier,
			NSArray operators, long options);

	@Generated
	@Selector("initWithLeftExpressions:rightExpressions:modifier:operators:options:")
	public native NSPredicateEditorRowTemplate initWithLeftExpressionsRightExpressionsModifierOperatorsOptions(
			NSArray leftExpressions, NSArray rightExpressions, long modifier,
			NSArray operators, long options);

	@Generated
	@Selector("leftExpressions")
	public native NSArray leftExpressions();

	@Generated
	@Selector("matchForPredicate:")
	public native double matchForPredicate(NSPredicate predicate);

	@Generated
	@Selector("modifier")
	public native long modifier();

	@Generated
	@Selector("operators")
	public native NSArray operators();

	@Generated
	@Selector("options")
	public native long options();

	@Generated
	@Selector("predicateWithSubpredicates:")
	public native NSPredicate predicateWithSubpredicates(NSArray subpredicates);

	@Generated
	@Selector("rightExpressionAttributeType")
	public native long rightExpressionAttributeType();

	@Generated
	@Selector("rightExpressions")
	public native NSArray rightExpressions();

	@Generated
	@Selector("setPredicate:")
	public native void setPredicate(NSPredicate predicate);

	@Generated
	@Selector("templateViews")
	public native NSArray templateViews();
}
