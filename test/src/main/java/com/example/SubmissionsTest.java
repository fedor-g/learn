package com.example;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SubmissionsTest {

    Clock clock = Clock.systemUTC();

    public static void main(String[] args) {
        SubmissionsTest t = new SubmissionsTest();

        Instant creation = t.clock.instant().minus(Period.ofWeeks(10));

        Instant now = t.clock.instant();

        Instant today1 = now;
        Instant today2 = now;
        Instant today3 = now;
        Instant minus1Day = now.minus(Period.ofDays(1));
        Instant minus2Days = now.minus(Period.ofDays(2));
        Instant minus3Days = now.minus(Period.ofDays(3));

        Instant minus8Days1 = now.minus(Period.ofDays(8));
        Instant minus8Days2 = now.minus(Period.ofDays(8));
        Instant minus8Days3 = now.minus(Period.ofDays(8));

        Instant minus16Days1 = now.minus(Period.ofDays(16));
        Instant minus16Days2 = now.minus(Period.ofDays(16));

        Instant minus17Days = now.minus(Period.ofDays(17));
        Instant minus18Days = now.minus(Period.ofDays(18));
        Instant minus19Days = now.minus(Period.ofDays(19));
        Instant minus20Days = now.minus(Period.ofDays(20));
        Instant minus21Days = now.minus(Period.ofDays(21));
        Instant minus22Days = now.minus(Period.ofDays(22));
        Instant minus23Days = now.minus(Period.ofDays(23));
        Instant minus24Days = now.minus(Period.ofDays(24));
        Instant minus25Days = now.minus(Period.ofDays(25));
        Instant minus26Days = now.minus(Period.ofDays(26));
        Instant minus27Days = now.minus(Period.ofDays(27));
        Instant minus28Days = now.minus(Period.ofDays(28));

        List<Instant> listI = new ArrayList<>();

        for (int i = 0; i < 80; i++) {
            if (i %2==0) {
                Instant i1 = now.minus(Period.ofDays(i));
                Instant i2 = now.minus(Period.ofDays(i));
                Instant i3 = now.minus(Period.ofDays(i));
                listI.add(i1);
                listI.add(i2);
                listI.add(i3);
            } else {
                Instant i1 = now.minus(Period.ofDays(i));
                Instant i2 = now.minus(Period.ofDays(i));
                listI.add(i1);
                listI.add(i2);
            }
        }




        List<Instant> list = Stream.of(now, today1, today2, today3, minus1Day, minus2Days, minus3Days, minus8Days1, minus8Days2, minus8Days3, minus16Days1,
                minus16Days2).toList();

        System.out.println(calculateFullSubmissionsChart(listI.stream(), creation, now));
        System.out.println(calculateSubmissionsChart(listI.stream(), now));
/*
        Test t = new Test();

        Instant now = t.clock.instant();

        Instant today1 = now;
        Instant today2 = now;
        Instant today3 = now;
        Instant minus1Day = now.minus(Period.ofDays(1));
        Instant minus2Days = now.minus(Period.ofDays(2));
        Instant minus3Days = now.minus(Period.ofDays(3));

        Instant minus8Days1 = now.minus(Period.ofDays(8));
        Instant minus8Days2 = now.minus(Period.ofDays(8));
        Instant minus8Days3 = now.minus(Period.ofDays(8));

        Instant minus16Days1 = now.minus(Period.ofDays(16));
        Instant minus16Days2 = now.minus(Period.ofDays(16));

        Instant minus23Days = now.minus(Period.ofDays(23));
        List<Instant> list = List.of(today1, today2, today3, //today3, today3, today3, minus1Day, minus1Day, minus1Day, minus1Day, minus2Days, minus3Days,
                minus8Days1, minus8Days1, minus8Days1, minus8Days1, minus8Days2, minus8Days3,
                //minus16Days1, minus16Days1, minus16Days1, minus16Days1, minus16Days1, minus16Days2,
                minus23Days, minus23Days, minus23Days, minus23Days, minus23Days, minus23Days);

        List<Entry<Long, Long>> longLongTreeMap = calculateSubmissionsChart(list.stream(), t.clock);


        System.out.println(longLongTreeMap.size());
        System.out.println(longLongTreeMap);
*/


    }

    public static List<PeakDto> calculateSubmissionsChart(Stream<Instant> submissionsStream, Instant instant) {
        Map<Long, Long> counts = submissionsStream.filter(e -> e.isAfter(instant.minus(28, ChronoUnit.DAYS)))
                .collect(Collectors.groupingBy(t -> Duration.between(t, instant).toDays() / 7, Collectors.counting()));
        return Stream.of(3L, 2L, 1L, 0L).map(i -> new PeakDto(i, counts.getOrDefault(i, 0L))).toList();
    }

    public static List<PeakDto> calculateFullSubmissionsChart(Stream<Instant> submissionsStream, Instant creation, Instant now) {
        long weeks = Duration.between(creation, now).toDays() / 7;
        Map<Long, Long> collect = submissionsStream.collect(Collectors.groupingBy(t -> Duration.between(t, now).toDays() / 7, Collectors.counting()));
        return LongStream.range(0, weeks).boxed().sorted(Collections.reverseOrder()).map(i -> new PeakDto(i, collect.getOrDefault(i, 0L))).toList();
    }

    /*



    private List<SubmissionEntity>  getMockedList(UUID datasourceId) {
        UUID studyId = UUID.randomUUID();
        UUID studyId2 = UUID.randomUUID();
        UUID studyId3 = UUID.randomUUID();

        UUID user1Id = UUID.randomUUID();
        UUID user2Id = UUID.randomUUID();
        UUID user3Id = UUID.randomUUID();

        UserEntity userEntity1 = Fn.create(UserEntity::new, user -> {
            user.setId(user1Id);
            user.setFirstName("FName1");
            user.setLastName("LName1");
            user.setEmail("FNameLName1@mail.com");
        });
        UserEntity userEntity2 = Fn.create(UserEntity::new, user -> {
            user.setId(user2Id);
            user.setFirstName("FName2");
            user.setLastName("LName2");
            user.setEmail("FNameLName2@mail.com");
        });
        UserEntity userEntity3 = Fn.create(UserEntity::new, user -> {
            user.setId(user1Id);
            user.setFirstName("FName1");
            user.setLastName("LName1");
            user.setEmail("FNameLName1@mail.com");
        });

        Instant minus1Day = clock.instant().minus(Period.ofDays(1));
        Instant minus8Days = clock.instant().minus(Period.ofDays(8));
        Instant minus17Days = clock.instant().minus(Period.ofDays(17));
        Instant minus25Days = clock.instant().minus(Period.ofDays(25));

        List<SubmissionEntity> mockList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            SubmissionEntity submissionEntity = Fn.create(SubmissionEntity::new, dto -> {
                dto.setBatch(Fn.create(SubmissionBatchEntity::new, batch -> {
                    batch.setSubmissions(List.of());
                    batch.setAnalysis(Fn.create(AnalysisEntity::new, analysis -> {
                        analysis.setId(UUID.randomUUID());
                    }));
                }));
                dto.setDataSource(dataSourceService.find(datasourceId));
                dto.setCurrentVersion(Fn.create(SubmissionVersion::new, version -> {
                    version.setVersionId(UUID.randomUUID());
                }));
                dto.setCurrent(Fn.create(Version::new, current -> {
                    current.setUser(userEntity1);
                    current.setTimestamp(minus1Day);
                }));
                dto.setResultInfo("Result");
                dto.setIdentity(Fn.create(Identity::new, identity -> {
                    identity.setId(studyId);
                }));

            });
            mockList.add(submissionEntity);
        }

        for (int i = 0; i < 15; i++) {
            SubmissionEntity submissionEntity = Fn.create(SubmissionEntity::new, dto -> {
                dto.setBatch(Fn.create(SubmissionBatchEntity::new, batch -> {
                    batch.setSubmissions(List.of());
                    batch.setAnalysis(Fn.create(AnalysisEntity::new, analysis -> {
                        analysis.setId(UUID.randomUUID());
                    }));
                }));
                dto.setDataSource(dataSourceService.find(datasourceId));
                dto.setCurrentVersion(Fn.create(SubmissionVersion::new, version -> {
                    version.setVersionId(UUID.randomUUID());
                }));
                dto.setCurrent(Fn.create(Version::new, current -> {
                    current.setUser(userEntity2);
                    current.setTimestamp(minus8Days);
                }));
                dto.setResultInfo("Result");
                dto.setIdentity(Fn.create(Identity::new, identity -> {
                    identity.setId(studyId2);
                }));

            });
            mockList.add(submissionEntity);
        }

        for (int i = 0; i < 3; i++) {
            SubmissionEntity submissionEntity = Fn.create(SubmissionEntity::new, dto -> {
                dto.setBatch(Fn.create(SubmissionBatchEntity::new, batch -> {
                    batch.setSubmissions(List.of());
                    batch.setAnalysis(Fn.create(AnalysisEntity::new, analysis -> {
                        analysis.setId(UUID.randomUUID());
                    }));
                }));
                dto.setDataSource(dataSourceService.find(datasourceId));
                dto.setCurrentVersion(Fn.create(SubmissionVersion::new, version -> {
                    version.setVersionId(UUID.randomUUID());
                }));
                dto.setCurrent(Fn.create(Version::new, current -> {
                    current.setUser(userEntity3);
                    current.setTimestamp(minus17Days);
                }));
                dto.setResultInfo("Result");
                dto.setIdentity(Fn.create(Identity::new, identity -> {
                    identity.setId(studyId3);
                }));

            });
            mockList.add(submissionEntity);
        }

        for (int i = 0; i < 50; i++) {
            SubmissionEntity submissionEntity = Fn.create(SubmissionEntity::new, dto -> {
                dto.setBatch(Fn.create(SubmissionBatchEntity::new, batch -> {
                    batch.setSubmissions(List.of());
                    batch.setAnalysis(Fn.create(AnalysisEntity::new, analysis -> {
                        analysis.setId(UUID.randomUUID());
                    }));
                }));
                dto.setDataSource(dataSourceService.find(datasourceId));
                dto.setCurrentVersion(Fn.create(SubmissionVersion::new, version -> {
                    version.setVersionId(UUID.randomUUID());
                }));
                dto.setCurrent(Fn.create(Version::new, current -> {
                    current.setUser(userEntity3);
                    current.setTimestamp(minus25Days);
                }));
                dto.setResultInfo("Result");
                dto.setIdentity(Fn.create(Identity::new, identity -> {
                    identity.setId(studyId3);
                }));

            });
            mockList.add(submissionEntity);
        }

        return mockList;
    }




    *
    * */

    static class PeakDto {

        public PeakDto(long w, long c) {
            this.weeksAgo = w;
            this.count = c;
        }

        private long weeksAgo;
        private long count;

        @Override
        public String toString() {
            return "PeakDto{" +
                    "weeksAgo=" + weeksAgo +
                    ", count=" + count +
                    '}';
        }
    }
}