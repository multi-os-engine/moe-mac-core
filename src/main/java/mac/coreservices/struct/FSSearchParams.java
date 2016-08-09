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

package mac.coreservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstCharPtr;

@Generated
@Structure(alignment = 2)
public final class FSSearchParams extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public FSSearchParams() {
		super(FSSearchParams.class);
	}

	@Generated
	protected FSSearchParams(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int searchTime();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSearchTime(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int searchBits();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSearchBits(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long searchNameLength();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSearchNameLength(long value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native ConstCharPtr searchName();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSearchName(ConstCharPtr value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSCatalogInfo searchInfo1();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setSearchInfo1(
			@UncertainArgument("Options: reference, array Fallback: reference") FSCatalogInfo value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native FSCatalogInfo searchInfo2();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setSearchInfo2(
			@UncertainArgument("Options: reference, array Fallback: reference") FSCatalogInfo value);
}
