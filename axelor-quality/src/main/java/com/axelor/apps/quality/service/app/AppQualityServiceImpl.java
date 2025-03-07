/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2019 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.quality.service.app;

import com.axelor.apps.base.db.AppQuality;
import com.axelor.apps.base.db.repo.AppQualityRepository;
import com.axelor.apps.base.service.app.AppBaseServiceImpl;
import com.google.inject.Inject;

public class AppQualityServiceImpl extends AppBaseServiceImpl implements AppQualityService {

  private AppQualityRepository appQualityRepo;

  @Inject
  public AppQualityServiceImpl(AppQualityRepository appQualityRepo) {
    this.appQualityRepo = appQualityRepo;
  }

  @Override
  public AppQuality getAppQuality() {
    return appQualityRepo.all().fetchOne();
  }
}
