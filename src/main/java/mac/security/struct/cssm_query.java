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

package mac.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class cssm_query extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_query() {
		super(cssm_query.class);
	}

	@Generated
	protected cssm_query(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int RecordType();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setRecordType(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int Conjunctive();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setConjunctive(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int NumSelectionPredicates();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setNumSelectionPredicates(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native VoidPtr SelectionPredicate();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSelectionPredicate(VoidPtr value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@ByValue
	public native cssm_query_limits QueryLimits();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setQueryLimits(@ByValue cssm_query_limits value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int QueryFlags();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setQueryFlags(int value);
}
