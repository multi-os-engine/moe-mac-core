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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSExpression extends NSObject implements NSSecureCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSExpression(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSExpression alloc();

	@Generated
	@Selector("allowEvaluation")
	public native void allowEvaluation();

	@Generated
	@Selector("arguments")
	public native NSArray arguments();

	@Generated
	@Selector("collection")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object collection();

	@Generated
	@Selector("constantValue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object constantValue();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("expressionForAggregate:")
	public static native NSExpression expressionForAggregate(
			NSArray subexpressions);

	@Generated
	@Selector("expressionForAnyKey")
	public static native NSExpression expressionForAnyKey();

	@Generated
	@Selector("expressionForBlock:arguments:")
	public static native NSExpression expressionForBlockArguments(
			@ObjCBlock(name = "call_expressionForBlockArguments") Block_expressionForBlockArguments block,
			NSArray arguments);

	@Runtime(ObjCRuntime.class)
	@Generated
	static public interface Block_expressionForBlockArguments {
		@Generated
		@MappedReturn(ObjCObjectMapper.class)
		public Object call_expressionForBlockArguments(
				@Mapped(ObjCObjectMapper.class) Object arg0, NSArray arg1,
				NSMutableDictionary arg2);
	}

	@Generated
	@Selector("expressionForConstantValue:")
	public static native NSExpression expressionForConstantValue(
			@Mapped(ObjCObjectMapper.class) Object obj);

	@Generated
	@Selector("expressionForEvaluatedObject")
	public static native NSExpression expressionForEvaluatedObject();

	@Generated
	@Selector("expressionForFunction:arguments:")
	public static native NSExpression expressionForFunctionArguments(
			String name, NSArray parameters);

	@Generated
	@Selector("expressionForFunction:selectorName:arguments:")
	public static native NSExpression expressionForFunctionSelectorNameArguments(
			NSExpression target, String name, NSArray parameters);

	@Generated
	@Selector("expressionForIntersectSet:with:")
	public static native NSExpression expressionForIntersectSetWith(
			NSExpression left, NSExpression right);

	@Generated
	@Selector("expressionForKeyPath:")
	public static native NSExpression expressionForKeyPath(String keyPath);

	@Generated
	@Selector("expressionForMinusSet:with:")
	public static native NSExpression expressionForMinusSetWith(
			NSExpression left, NSExpression right);

	@Generated
	@Selector("expressionForSubquery:usingIteratorVariable:predicate:")
	public static native NSExpression expressionForSubqueryUsingIteratorVariablePredicate(
			NSExpression expression, String variable,
			@Mapped(ObjCObjectMapper.class) Object predicate);

	@Generated
	@Selector("expressionForUnionSet:with:")
	public static native NSExpression expressionForUnionSetWith(
			NSExpression left, NSExpression right);

	@Generated
	@Selector("expressionForVariable:")
	public static native NSExpression expressionForVariable(String string);

	@Generated
	@Selector("expressionType")
	public native long expressionType();

	@Generated
	@Selector("expressionValueWithObject:context:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object expressionValueWithObjectContext(
			@Mapped(ObjCObjectMapper.class) Object object,
			NSMutableDictionary context);

	@Generated
	@Selector("expressionWithFormat:argumentArray:")
	public static native NSExpression expressionWithFormatArgumentArray(
			String expressionFormat, NSArray arguments);

	@Generated
	@Selector("function")
	public native String function();

	@Generated
	@Selector("init")
	public native NSExpression init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithExpressionType:")
	public native NSExpression initWithExpressionType(long type);

	@Generated
	@Selector("keyPath")
	public native String keyPath();

	@Generated
	@Selector("leftExpression")
	public native NSExpression leftExpression();

	@Generated
	@Selector("operand")
	public native NSExpression operand();

	@Generated
	@Selector("predicate")
	public native NSPredicate predicate();

	@Generated
	@Selector("rightExpression")
	public native NSExpression rightExpression();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("variable")
	public native String variable();
}
