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


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure(alignment = 2)
public final class SleepQRec extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public SleepQRec() {
		super(SleepQRec.class);
	}

	@Generated
	protected SleepQRec(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native SleepQRec sleepQLink();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSleepQLink(
			@UncertainArgument("Options: reference, array Fallback: reference") SleepQRec value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short sleepQType();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSleepQType(short value);

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSleepQProc(
			@FunctionPtr(name = "call_sleepQProc") Function_sleepQProc value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_sleepQProc {
		@Generated
		public long call_sleepQProc(
				long arg0,
				@UncertainArgument("Options: reference, array Fallback: reference") SleepQRec arg1);
	}

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short sleepQFlags();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setSleepQFlags(short value);
}
