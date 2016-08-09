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

package mac.applicationservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class ATSFlatDataStyleListStyleDataHeader extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ATSFlatDataStyleListStyleDataHeader() {
		super(ATSFlatDataStyleListStyleDataHeader.class);
	}

	@Generated
	protected ATSFlatDataStyleListStyleDataHeader(Pointer peer) {
		super(peer);
	}

	@Generated
	public ATSFlatDataStyleListStyleDataHeader(int sizeOfStyleInfo,
			int numberOfSetAttributes, int numberOfSetFeatures,
			int numberOfSetVariations) {
		super(ATSFlatDataStyleListStyleDataHeader.class);
		setSizeOfStyleInfo(sizeOfStyleInfo);
		setNumberOfSetAttributes(numberOfSetAttributes);
		setNumberOfSetFeatures(numberOfSetFeatures);
		setNumberOfSetVariations(numberOfSetVariations);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int sizeOfStyleInfo();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSizeOfStyleInfo(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int numberOfSetAttributes();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNumberOfSetAttributes(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int numberOfSetFeatures();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setNumberOfSetFeatures(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int numberOfSetVariations();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setNumberOfSetVariations(int value);
}
