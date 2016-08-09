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
public final class CMVideoCardGammaFormula extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CMVideoCardGammaFormula() {
		super(CMVideoCardGammaFormula.class);
	}

	@Generated
	protected CMVideoCardGammaFormula(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int redGamma();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setRedGamma(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int redMin();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setRedMin(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int redMax();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setRedMax(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int greenGamma();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setGreenGamma(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int greenMin();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setGreenMin(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int greenMax();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setGreenMax(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int blueGamma();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setBlueGamma(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int blueMin();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setBlueMin(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int blueMax();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setBlueMax(int value);
}
