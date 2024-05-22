#
# Copyright 2022 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
set -eo pipefail

scriptDir="$(cd -P -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd -P)"

pushd "$scriptDir" >/dev/null
source ./helpers/init.sh "$1"
source ./helpers/gcloud-login.sh
source ./helpers/gcloud-create-project.sh
source ./helpers/gcloud-create-service-account.sh
source ./helpers/plan.sh "$1"
source ./helpers/apply.sh
popd >/dev/null

# Ensure all SNAPSHOTs are available in the local mvn repository
pushd "$scriptDir/.." >/dev/null
source ./.kokoro/common.sh
install_modules "$1"
popd >/dev/null
