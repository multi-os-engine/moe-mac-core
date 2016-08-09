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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import mac.coregraphics.struct.CGPoint;

@Generated
@Structure(alignment = 2)
public final class ATSUCurvePath extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public ATSUCurvePath() {
		super(ATSUCurvePath.class);
	}

	@Generated
	protected ATSUCurvePath(Pointer peer) {
		super(peer);
	}

	@Generated
	public ATSUCurvePath(int vectors, int controlBits, @ByValue CGPoint vector) {
		super(ATSUCurvePath.class);
		setVectors(vectors);
		setControlBits(controlBits);
		setVector(vector);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int vectors();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVectors(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int controlBits();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setControlBits(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@ByValue
	public native CGPoint vector();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setVector(@ByValue CGPoint value);
}
