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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSComparisonPredicate extends NSPredicate {
	static {
		NatJ.register();
	}

	@Generated
	protected NSComparisonPredicate(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSComparisonPredicate alloc();

	@Generated
	@Selector("comparisonPredicateModifier")
	public native long comparisonPredicateModifier();

	@Generated
	@Selector("customSelector")
	public native SEL customSelector();

	@Generated
	@Selector("init")
	public native NSComparisonPredicate init();

	@Generated
	@Selector("initWithLeftExpression:rightExpression:customSelector:")
	public native NSComparisonPredicate initWithLeftExpressionRightExpressionCustomSelector(
			NSExpression lhs, NSExpression rhs, SEL selector);

	@Generated
	@Selector("initWithLeftExpression:rightExpression:modifier:type:options:")
	public native NSComparisonPredicate initWithLeftExpressionRightExpressionModifierTypeOptions(
			NSExpression lhs, NSExpression rhs, long modifier, long type,
			long options);

	@Generated
	@Selector("leftExpression")
	public native NSExpression leftExpression();

	@Generated
	@Selector("options")
	public native long options();

	@Generated
	@Selector("predicateFromMetadataQueryString:")
	public static native NSPredicate predicateFromMetadataQueryString(
			String queryString);

	@Generated
	@Selector("predicateOperatorType")
	public native long predicateOperatorType();

	@Generated
	@Selector("predicateWithBlock:")
	public static native NSPredicate predicateWithBlock(
			@ObjCBlock(name = "call_predicateWithBlock") NSPredicate.Block_predicateWithBlock block);

	@Generated
	@Selector("predicateWithFormat:argumentArray:")
	public static native NSPredicate predicateWithFormatArgumentArray(
			String predicateFormat, NSArray arguments);

	@Generated
	@Selector("predicateWithLeftExpression:rightExpression:customSelector:")
	public static native NSPredicate predicateWithLeftExpressionRightExpressionCustomSelector(
			NSExpression lhs, NSExpression rhs, SEL selector);

	@Generated
	@Selector("predicateWithLeftExpression:rightExpression:modifier:type:options:")
	public static native NSPredicate predicateWithLeftExpressionRightExpressionModifierTypeOptions(
			NSExpression lhs, NSExpression rhs, long modifier, long type,
			long options);

	@Generated
	@Selector("predicateWithValue:")
	public static native NSPredicate predicateWithValue(boolean value);

	@Generated
	@Selector("rightExpression")
	public native NSExpression rightExpression();
}
