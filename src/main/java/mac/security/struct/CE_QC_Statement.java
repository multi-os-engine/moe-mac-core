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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;

@Generated
@Structure()
public final class CE_QC_Statement extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CE_QC_Statement() {
		super(CE_QC_Statement.class);
	}

	@Generated
	protected CE_QC_Statement(Pointer peer) {
		super(peer);
	}

	@Generated
	public CE_QC_Statement(
			@ByValue cssm_data statementId,
			@UncertainArgument("Options: reference, array Fallback: reference") CE_SemanticsInformation semanticsInfo,
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_data otherInfo) {
		super(CE_QC_Statement.class);
		setStatementId(statementId);
		setSemanticsInfo(semanticsInfo);
		setOtherInfo(otherInfo);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	@ByValue
	public native cssm_data statementId();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setStatementId(@ByValue cssm_data value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native CE_SemanticsInformation semanticsInfo();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSemanticsInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") CE_SemanticsInformation value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	@UncertainReturn("Options: reference, array Fallback: reference")
	public native cssm_data otherInfo();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setOtherInfo(
			@UncertainArgument("Options: reference, array Fallback: reference") cssm_data value);
}
