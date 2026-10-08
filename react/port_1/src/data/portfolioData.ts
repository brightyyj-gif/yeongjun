import { Project, Experience, SkillCategory } from '../types/portfolio';

export const HERO_IMAGE = '/src/assets/images/hero_workspace_1791446147262.jpg';

export const PROJECTS: Project[] = [
  {
    id: 'pulse-design-system',
    title: 'Pulse Design System & Token Compiler',
    subtitle: '멀티 테마 디자인 토큰 및 고접근성 컴포넌트 프레임워크',
    category: 'design-system',
    categoryLabel: '디자인 시스템 & 인프라',
    year: '2026',
    period: '2025.04 — 2026.02',
    role: 'Lead Frontend Engineer / Core Maintainer',
    team: '플랫폼 UX 엔지니어링팀 (6명)',
    image: '/src/assets/images/project_design_system_1791446167184.jpg',
    summary: '전사 40여 개 프로덕트에서 공통으로 사용하는 디자인 토큰 컴파일러 및 65종의 헤드리스/스타일드 React 컴포넌트 라이브러리 구축.',
    challenge: '각 팀마다 분산된 UI 코드베이스로 인한 번들 크기 증가, 접근성 표준 미달, 그리고 디자인 토큰 변경 시 수동 배포로 인한 싱크 불일치 문제 해결.',
    solution: 'Figma Tokens API와 연동된 Style-Dictionary 기반 자동 토큰 파이프라인 구축. Radix UI 헤드리스 프리미티브 기반으로 WCAG 2.1 AA 100%를 달성하고 Tree-shaking 최적화.',
    impactMetrics: [
      { label: '전사 번들 사이즈', value: '-42%' },
      { label: '신규 화면 개발 리드타임', value: '-65%' },
      { label: 'WCAG 2.1 AA 적합도', value: '100%' },
      { label: '주간 활성 다운로드', value: '38,000+' }
    ],
    techStack: ['React 19', 'TypeScript', 'Tailwind CSS', 'Radix UI', 'Style Dictionary', 'Storybook', 'Turborepo'],
    features: [
      'AST 기반 토큰 변환기로 CSS Variables, Tailwind v4 Preset, React Native 토큰 동시 생성',
      '화면 낭독기(VoiceOver, NVDA) 및 키보드 트랩 자동 검증 E2E 테스트(Playwright)',
      '컴포넌트 단위 번들 최적화 및 Dynamic Subpath Exports (`package.json`)',
      '문서화 포털 및 컴포넌트 실시간 프롭스 플레이그라운드 내장'
    ],
    architectureSnippet: `// Token Compiler Pipeline
export const compileDesignTokens = async (rawTokens: RawTokenSet) => {
  const dictionary = StyleDictionary.extend({
    source: ['tokens/**/*.json'],
    platforms: {
      css: {
        transformGroup: 'css',
        buildPath: 'dist/styles/',
        files: [{ destination: 'variables.css', format: 'css/variables' }]
      },
      tailwind: {
        transformGroup: 'js',
        buildPath: 'dist/',
        files: [{ destination: 'preset.js', format: 'javascript/module-flat' }]
      }
    }
  });
  return dictionary.buildAllPlatforms();
};`,
    githubUrl: 'https://github.com',
    demoUrl: 'https://storybook.example.com'
  },
  {
    id: 'hyperion-data-studio',
    title: 'Hyperion Data Studio',
    subtitle: '대규모 실시간 시계열 데이터 가시화 웹 플랫폼',
    category: 'data-viz',
    categoryLabel: '데이터 시각화',
    year: '2025',
    period: '2025.01 — 2025.10',
    role: 'Frontend Performance Architect',
    team: '데이터 플랫폼 파이프라인팀 (8명)',
    image: '/src/assets/images/project_analytics_dashboard_1791446182489.jpg',
    summary: '초당 20,000건의 WebSocket 스트리밍 데이터를 메인 스레드 락 없이 60fps로 실시간 차트 렌더링하는 고성능 분석 대시보드.',
    challenge: '수십만 개 데이터 포인트가 유입될 때 브라우저 가비지 컬렉션(GC) 폭주와 메인 스레드 블로킹으로 인한 입력 딜레이(INP > 500ms) 발생.',
    solution: 'Web Worker를 활용한 전처리 및 이진 스트림(ArrayBuffer) 파싱. Canvas 2D / WebGL 렌더링 파이프라인으로 전환하고 OffscreenCanvas를 도입하여 메인 스레드 분리.',
    impactMetrics: [
      { label: '지속 렌더링 프레임레이트', value: '60 FPS' },
      { label: 'INP (Interaction to Next Paint)', value: '< 45ms' },
      { label: '메인 스레드 CPU 점유율', value: '-68%' },
      { label: '초당 처리 스트림 이벤트', value: '25,000+' }
    ],
    techStack: ['Next.js', 'TypeScript', 'OffscreenCanvas', 'Web Workers', 'Zustand', 'Tailwind CSS', 'WebSockets'],
    features: [
      'OffscreenCanvas + Web Worker 렌더 파이프라인으로 메인 UI 끊김 원천 차단',
      '데이터 윈도잉 줌 & 팬 알고리즘 (LTTB: Largest-Triangle-Three-Buckets 다운샘플링)',
      '실시간 임계치 알람 트리거 및 사용자 정의 수식 지표 계산기',
      '서버 사이드 렌더링(SSR) 대시보드 스냅샷 및 PDF 고해상도 리포트 생성기'
    ],
    architectureSnippet: `// Web Worker Streaming Consumer
self.onmessage = (event: MessageEvent<ArrayBuffer>) => {
  const floatView = new Float64Array(event.data);
  const downsampled = lttbDownsample(floatView, TARGET_POINTS);
  
  // Render directly via OffscreenCanvas context in background worker
  renderFrame(offscreenCtx, downsampled);
  self.postMessage({ status: 'frame_rendered', count: downsampled.length });
};`,
    githubUrl: 'https://github.com',
    demoUrl: 'https://hyperion.example.com'
  },
  {
    id: 'aura-wealth-app',
    title: 'Aura Wealth Mobile Web & PWA',
    subtitle: '차세대 핀테크 자산 포트폴리오 관리 웹 서비스',
    category: 'web-app',
    categoryLabel: '고성능 웹 애플리케이션',
    year: '2024',
    period: '2024.03 — 2024.12',
    role: 'Frontend Engineer',
    team: '핀테크 서비스 개발팀 (10명)',
    image: '/src/assets/images/project_fintech_app_1791446199249.jpg',
    summary: '네이티브 앱 수준의 쫀득한 제스처 애니메이션과 오프라인 결제/자산 트래킹을 지원하는 모바일 퍼스트 핀테크 웹 애플리케이션.',
    challenge: '모바일 웹 브라우저의 뷰포트 바운스, 터치 제스처 지연, 네트워크 단절 상황에서의 폼 입력 유실 방지.',
    solution: 'Framer Motion 터치 제스처 최적화와 CSS touch-action 바인딩. TanStack Query 오프라인 뮤테이션 큐 및 IndexedDB 로컬 캐시 레이어 구현.',
    impactMetrics: [
      { label: 'FCP (First Contentful Paint)', value: '0.8s' },
      { label: '오프라인 트랜잭션 복구율', value: '99.9%' },
      { label: '모바일 사용자 리텐션 (D30)', value: '+34%' },
      { label: 'Lighthouse 모바일 총점', value: '98 / 100' }
    ],
    techStack: ['React', 'TypeScript', 'TanStack Query', 'Motion', 'IndexedDB', 'Workbox PWA', 'Vite'],
    features: [
      '스마트폰 하단 시트(Bottom Sheet) 물리 기반 스와이프 제스처 인터랙션',
      '네트워크 끊김 감지 시 낙관적 업데이트(Optimistic UI) 및 지수 백오프 자동 재시도',
      '생체 인증 WebAuthn(지문/Face ID) 간편 로그인 연동',
      '암호화된 IndexedDB 로컬 자산 장부 및 자동 마이그레이션 모듈'
    ],
    architectureSnippet: `// Optimistic Offline Mutation Queue
const useAssetTransaction = () => {
  return useMutation({
    mutationFn: submitTransactionAPI,
    onMutate: async (newTx) => {
      await queryClient.cancelQueries({ queryKey: ['portfolio'] });
      const previousState = queryClient.getQueryData(['portfolio']);
      queryClient.setQueryData(['portfolio'], (old: any) => ({
        ...old,
        totalBalance: old.totalBalance + newTx.amount,
        transactions: [newTx, ...old.transactions]
      }));
      await localDb.pendingTransactions.add(newTx);
      return { previousState };
    }
  });
};`,
    githubUrl: 'https://github.com',
    demoUrl: 'https://aura.example.com'
  },
  {
    id: 'flowgraph-shader-studio',
    title: 'FlowGraph Shader Lab & 3D Canvas',
    subtitle: '브라우저 기반 노드 그래프 GLSL 비주얼라이저',
    category: 'canvas',
    categoryLabel: '인터랙티브 캔버스 & 그래픽스',
    year: '2024',
    period: '2024.08 — 2024.11',
    role: 'Creator & Lead Developer',
    team: '오픈소스 프로젝트',
    image: '/src/assets/images/project_analytics_dashboard_1791446182489.jpg',
    summary: '디자이너와 프론트엔드 개발자가 코드 없이 노드를 이어 실시간 프래그먼트 셰이더를 생성하고 3D 메쉬에 즉시 매핑하는 실험적 도구.',
    challenge: '복잡한 비순환 방향 그래프(DAG) 구조를 실시간 유효한 GLSL 코드로 컴파일하고 60fps 렌더링 유지.',
    solution: 'React Flow 기반의 캔버스 위에 자체 AST 파서를 구현하여 노드 연결 즉시 실시간 셰이더 컴파일 및 Three.js 재질 갱신.',
    impactMetrics: [
      { label: '셰이더 리컴파일 지연시간', value: '< 12ms' },
      { label: '오픈소스 GitHub Stars', value: '1,200+' },
      { label: '프레임 레이트', value: '60 FPS' },
      { label: '내장 노드 라이브러리', value: '48종' }
    ],
    techStack: ['React', 'Three.js', 'React Flow', 'GLSL', 'TypeScript', 'Vite', 'Tailwind CSS'],
    features: [
      'Noise, Voronoi, Raymarching 등 48개 내장 수학/텍스처 노드',
      '노드 캔버스 실시간 줌/팬 미니맵 및 다크 캔버스 UI',
      'GLSL 코드 실시간 내보내기 및 Three.js Custom Shader Material 호환',
      'WebGPU 전환을 고려한 추상 셰이더 인터페이스 설계'
    ],
    architectureSnippet: `// DAG to GLSL Code Generation
export function compileGraphToGLSL(nodes: Node[], edges: Edge[]): string {
  const sortedNodes = topologicalSort(nodes, edges);
  const statements = sortedNodes.map(node => node.data.toShaderExpression());
  return \`
    precision highp float;
    varying vec2 vUv;
    uniform float uTime;
    void main() {
      \${statements.join('\\n      ')}
      gl_FragColor = finalColor;
    }
  \`;
}`,
    githubUrl: 'https://github.com',
    demoUrl: 'https://shaderlab.example.com'
  }
];

export const EXPERIENCES: Experience[] = [
  {
    id: 'exp-1',
    company: '핀테크 테크유니콘 (VivaTech)',
    role: 'Senior Frontend Engineer / Web Platform Lead',
    period: '2023.03 — 현재 (재직중)',
    location: '서울 강남구 (하이브리드)',
    description: '핵심 금융 상품 유입 퍼널 및 웹 플랫폼 아키텍처를 총괄하며, 사용자 경험 개선과 엔지니어링 표준 수립 주도.',
    achievements: [
      '핵심 대출 비교 퍼널의 Core Web Vitals(INP 320ms → 48ms, LCP 2.4s → 1.1s) 개선으로 유입 전환율 +14.2% 달성',
      '마이크로 프론트엔드 모듈 페더레이션(Module Federation) 도입으로 7개 팀의 독립 배포 및 CI 빌드 시간 62% 단축',
      '전사 공통 디자인 시스템 컴포넌트 60종의 접근성(WCAG 2.1 AA) 전수 감사 및 키보드/스크린리더 완벽 지원',
      '프론트엔드 에러 트래킹(Sentry) 및 성능 원격 로깅 파이프라인 구축으로 프로덕션 크래시율 0.02% 이하 유지'
    ],
    techStack: ['Next.js', 'React 19', 'TypeScript', 'Module Federation', 'TanStack Query', 'Playwright', 'Tailwind CSS']
  },
  {
    id: 'exp-2',
    company: '엔터프라이즈 SaaS 플랫폼 (CloudOps Labs)',
    role: 'Frontend Engineer',
    period: '2021.05 — 2023.02 (1년 10개월)',
    location: '서울 서초구',
    description: '클라우드 인프라 모니터링 콘솔 프론트엔드 개발 및 수천 대의 서버 메트릭 시각화 차트 엔진 구현.',
    achievements: [
      'DOM 기반 차트 렌더링을 Canvas/WebGL 엔진으로 전면 개편하여 대규모 메트릭 렌더링 시 브라우저 멈춤 현상 100% 제거',
      '복잡한 레거시 React 코드베이스(Redux)를 Zustand 및 React Query로 점진적 리팩토링하여 보일러플레이트 코드 55% 감소',
      '디자인-개발 협업을 위한 Storybook 디자인 토큰 문서화 시스템 도입'
    ],
    techStack: ['React', 'TypeScript', 'Zustand', 'Canvas API', 'RxJS', 'Storybook', 'Jest']
  },
  {
    id: 'exp-3',
    company: '크리에이티브 인터랙티브 스튜디오 (Studio V)',
    role: 'Junior Frontend Developer',
    period: '2020.01 — 2021.04 (1년 4개월)',
    location: '서울 마포구',
    description: '글로벌 브랜드 디지털 쇼케이스 웹사이트 구축 및 고난이도 인터랙티브 웹 인터페이스 제작.',
    achievements: [
      'Webflow 및 Three.js를 결합한 브랜드 3D 쇼룸 구축으로 2020 Awwwards Site of the Day 수상',
      'GSAP 및 ScrollTrigger를 이용한 부드러운 스크롤 인터랙션과 크로스 브라우징(Safari, Chrome, iOS) 모바일 대응'
    ],
    techStack: ['JavaScript (ES6+)', 'Three.js', 'GSAP', 'HTML5/CSS3', 'WebGL']
  }
];

export const SKILL_CATEGORIES: SkillCategory[] = [
  {
    title: 'Core & Languages',
    items: [
      { name: 'TypeScript', level: 'Expert', description: '엄격한 정적 타이핑, Generic, Mapped Types, AST 활용' },
      { name: 'JavaScript (ESNext)', level: 'Expert', description: '이벤트 루프, 비동기 파이프라인, V8 엔진 최적화 이해' },
      { name: 'HTML5 Semantic & a11y', level: 'Expert', description: 'ARIA, WCAG 2.1 AA 기준 스크린 리더 친화적 구조화' },
      { name: 'Modern CSS & Tailwind', level: 'Expert', description: 'Container Queries, Subgrid, CSS Variables, Tailwind v4' }
    ]
  },
  {
    title: 'Frameworks & Runtime',
    items: [
      { name: 'React 19 & Next.js', level: 'Expert', description: 'RSC, Server Actions, Suspense, Concurrent Mode' },
      { name: 'TanStack Query / SWR', level: 'Expert', description: '낙관적 업데이트, 백그라운드 재검증, 캐시 무효화' },
      { name: 'Zustand / Jotai', level: 'Proficient', description: '최소 단위 리렌더링 및 원자적 클라이언트 상태 관리' },
      { name: 'Node.js & Express', level: 'Proficient', description: 'BFF(Backend-For-Frontend), SSR 서버 엔드포인트 구축' }
    ]
  },
  {
    title: 'Graphics & Performance',
    items: [
      { name: 'Web Performance Optimization', level: 'Expert', description: 'Core Web Vitals(INP, LCP, CLS), 번들 분석, Tree-shaking' },
      { name: 'Canvas 2D & WebGL', level: 'Proficient', description: 'OffscreenCanvas, 대규모 데이터 가시화, Three.js 씬 구성' },
      { name: 'Web Workers & Multithreading', level: 'Proficient', description: '무거운 연산 메인 스레드 분리 및 ArrayBuffer 전송' },
      { name: 'Motion & Interactive UI', level: 'Expert', description: 'Framer Motion 스프링 물리, 제스처 바인딩' }
    ]
  },
  {
    title: 'Tooling & Reliability',
    items: [
      { name: 'Vite & Turborepo', level: 'Expert', description: '모노레포 빌드 파이프라인 최적화, esbuild/Rolldown' },
      { name: 'Playwright & Vitest', level: 'Proficient', description: 'E2E 자동화 테스트, 단위/통합 테스트 커버리지 관리' },
      { name: 'CI/CD & Monitoring', level: 'Proficient', description: 'GitHub Actions, Sentry 에러 추적, DataDog APM' }
    ]
  }
];

export const PHILOSOPHY_PILLARS = [
  {
    number: '01',
    title: 'Zero Jitter & Frame Budget',
    subtitle: '16ms 프레임 예산과 무결점 반응성',
    description: '사용자가 마우스를 움직이거나 터치할 때 단 1프레임의 버벅임도 허용하지 않습니다. 레이아웃 스래싱을 사전에 차단하고, 합성 단계(Composite) 속성만을 변형하며, 필요 시 Web Worker와 OffscreenCanvas로 메인 스레드를 보호합니다.'
  },
  {
    number: '02',
    title: 'Radical Accessibility (a11y)',
    subtitle: '모두를 위한 웹 표준과 포용적 경험',
    description: '디자인과 기술은 누구도 배제하지 않아야 합니다. 키보드만으로 모든 인터랙션을 탐색할 수 있는 포커스 링, 스크린 리더를 위한 시맨틱 ARIA 트리, WCAG AA 기준의 색상 명도비를 설계의 기본 전제로 채택합니다.'
  },
  {
    number: '03',
    title: 'Predictable State Separation',
    subtitle: '서버 캐시와 UI 로컬 상태의 엄격한 분리',
    description: '서버 데이터는 언제든 만료될 수 있는 캐시로 취급하고, UI 상태는 컴포넌트 생명주기에 종속시킵니다. 불필요한 전역 상태 오염을 줄여 버그 발생 가능성을 원천적으로 격리하고 코드 예측성을 높입니다.'
  },
  {
    number: '04',
    title: 'Engineering Rigor & DX',
    subtitle: '유지보수성과 개발자 경험의 균형',
    description: '명확한 타입 정의, 자체 문서화된 컴포넌트 인터페이스, 신뢰할 수 있는 자동화 테스트는 팀 전체의 개발 속도를 비약적으로 높입니다. 유지보수가 즐거운 아키텍처를 설계합니다.'
  }
];
