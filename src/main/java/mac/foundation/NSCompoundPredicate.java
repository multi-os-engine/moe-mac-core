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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSCompoundPredicate extends NSPredicate {
	static {
		NatJ.register();
	}

	@Generated
	protected NSCompoundPredicate(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSCompoundPredicate alloc();

	@Generated
	@Selector("andPredicateWithSubpredicates:")
	public static native NSPredicate andPredicateWithSubpredicates(
			NSArray subpredicates);

	@Generated
	@Selector("compoundPredicateType")
	public native long compoundPredicateType();

	@Generated
	@Selector("init")
	public native NSCompoundPredicate init();

	@Generated
	@Selector("initWithType:subpredicates:")
	public native NSCompoundPredicate initWithTypeSubpredicates(long type,
			NSArray subpredicates);

	@Generated
	@Selector("notPredicateWithSubpredicate:")
	public static native NSPredicate notPredicateWithSubpredicate(
			NSPredicate predicate);

	@Generated
	@Selector("orPredicateWithSubpredicates:")
	public static native NSPredicate orPredicateWithSubpredicates(
			NSArray subpredicates);

	@Generated
	@Selector("predicateFromMetadataQueryString:")
	public static native NSPredicate predicateFromMetadataQueryString(
			String queryString);

	@Generated
	@Selector("predicateWithBlock:")
	public static native NSPredicate predicateWithBlock(
			@ObjCBlock(name = "call_predicateWithBlock") NSPredicate.Block_predicateWithBlock block);

	@Generated
	@Selector("predicateWithFormat:argumentArray:")
	public static native NSPredicate predicateWithFormatArgumentArray(
			String predicateFormat, NSArray arguments);

	@Generated
	@Selector("predicateWithValue:")
	public static native NSPredicate predicateWithValue(boolean value);

	@Generated
	@Selector("subpredicates")
	public native NSArray subpredicates();
}
